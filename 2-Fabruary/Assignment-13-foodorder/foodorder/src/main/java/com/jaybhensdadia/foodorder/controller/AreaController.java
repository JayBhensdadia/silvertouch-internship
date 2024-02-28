package com.jaybhensdadia.foodorder.controller;

import java.io.IOException;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaybhensdadia.foodorder.entities.Area;
import com.jaybhensdadia.foodorder.entities.City;
import com.jaybhensdadia.foodorder.entities.User;
import com.jaybhensdadia.foodorder.generator.PdfGenerator;
import com.jaybhensdadia.foodorder.repositories.UserRepo;
import com.jaybhensdadia.foodorder.services.AreaService;
import com.jaybhensdadia.foodorder.services.CityService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    AreaService areaService;

    @Autowired
    CityService cityService;


    @Autowired
    UserRepo userRepo;

    @GetMapping("/manage-area")
    public String manageArea(Model model) {
        // model.addAttribute("role", "ADMIN");
        // model.addAttribute("page", "manage-area");
        // model.addAttribute("areas", areaService.getAllAreas());
        return "redirect:/area/page/1";
    }

    @GetMapping("/add-area")
    public String addArea(Model model) {
        model.addAttribute("page", "add-area");
        model.addAttribute("cities", cityService.getAllCities());
        return "home";
    }

    @PostMapping("/add-area-to-db")
    public String addAreaToDb(@ModelAttribute Area area) {
        areaService.addArea(area);
        return "redirect:/area/manage-area";
    }

    @GetMapping("/edit-area/{id}")
    public String editCity(Model model, @PathVariable String id) throws Exception {

        Area area = areaService.getAreaById(Long.parseLong(id));
        model.addAttribute("area", area);
        model.addAttribute("page", "edit-area");
        return "home";
    }

    @PostMapping("/update-area/{id}")
    public String updateCity(@PathVariable String id, @ModelAttribute Area area) throws Exception {

        Area oldArea = areaService.getAreaById(Long.parseLong(id));

        oldArea.setCityName(area.getCityName());
        oldArea.setAreaName(area.getAreaName());
        oldArea.setDescription(area.getDescription());

        areaService.saveToDb(oldArea);

        return "redirect:/area/manage-area";
    }

    @GetMapping("/delete-area/{id}")
    public String deleteCity(@PathVariable String id) {
        areaService.deleteAreaById(Long.parseLong(id));
        return "redirect:/area/manage-area";
    }

    @GetMapping("/pdf")
    public void generatePDf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=area" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);
        PdfGenerator generator = new PdfGenerator();
        generator.generatePdfForArea(areaService.getAllAreas(), response);
    }

    @GetMapping("/page/{page}")
    public String mangeAreaPaged(Model model, @PathVariable("page") int page, Principal principal) {

        int currentPage = page;
        int pageSize = 5;
        Page<Area> areaPage = areaService.getPaginatedAreas(PageRequest.of(currentPage - 1, pageSize));
        int totalPages = areaPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", areaPage.getTotalElements());
        model.addAttribute("areas", areaPage.getContent());
        model.addAttribute("page", "manage-area");

        String username = principal.getName();

        //get user of username from db
        Optional<User> user = userRepo.findByEmail(username);

        model.addAttribute("role", user.get().getRole());
        

        // model.addAttribute("role", "ADMIN");
        return "home";
    }

}
