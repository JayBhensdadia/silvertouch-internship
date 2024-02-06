package com.example.servletdemo.handlingSessionAttribute.p2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session-attribute-change")
public class SessionAttributeServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        
        session.setAttribute("username", "john_doe");
        session.removeAttribute("username");
        session.setAttribute("email", "john@example.com");
        session.setAttribute("email", "john.doe@example.com");

        
        response.getWriter().println("Check the console for session attribute change logs.");
    }
}
