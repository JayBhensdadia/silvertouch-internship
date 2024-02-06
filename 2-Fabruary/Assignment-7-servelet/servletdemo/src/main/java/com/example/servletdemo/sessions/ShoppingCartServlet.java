package com.example.servletdemo.sessions;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/shopping-cart")
public class ShoppingCartServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");

        
        HttpSession session = request.getSession(true);

        
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Shopping Cart Servlet</title></head><body>");

        
        List<String> shoppingCart = (List<String>) session.getAttribute("cart");
        if (shoppingCart == null) {
            shoppingCart = new ArrayList<>();
            shoppingCart.add("Mobile");
            shoppingCart.add("Laptop");
            session.setAttribute("cart", shoppingCart);
        }

        
        String newItem = request.getParameter("item");
        if (newItem != null && !newItem.isEmpty()) {
            shoppingCart.add(newItem);
            out.println("<p>Item added to the cart: " + newItem + "</p>");
        }

        
        out.println("<h2>Shopping Cart</h2>");
        if (shoppingCart.isEmpty()) {
            out.println("<p>Your cart is empty.</p>");
        } else {
            out.println("<ul>");
            for (String item : shoppingCart) {
                out.println("<li>" + item + "</li>");
            }
            out.println("</ul>");
        }

        
        out.println("<h2>Add Item to Cart</h2>");
        out.println("<form action=\"ShoppingCartServlet\" method=\"get\">");
        out.println("<label for=\"item\">Item:</label>");
        out.println("<input type=\"text\" id=\"item\" name=\"item\" required>");
        out.println("<input type=\"submit\" value=\"Add to Cart\">");
        out.println("</form>");

        out.println("</body></html>");
    }

}
