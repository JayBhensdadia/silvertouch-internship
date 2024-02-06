package com.example.servletdemo.advanceSessionManagement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserContentServlet")
public class UserContentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");

        
        HttpSession session = request.getSession(true);

        
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>User Content Servlet</title></head><body>");

        
        if (session.getAttribute("user") != null) {
            
            String username = (String) session.getAttribute("user");
            out.println("<p>Welcome back, " + username + "!</p>");
            out.println("<p>This is your personalized content.</p>");
            out.println("<p><a href=\"logout\">Logout</a></p>");
        } else {
            
            out.println("<p>You are not logged in. Please <a href=\"simple\">log in</a>.</p>");
        }

        out.println("</body></html>");
    }
}