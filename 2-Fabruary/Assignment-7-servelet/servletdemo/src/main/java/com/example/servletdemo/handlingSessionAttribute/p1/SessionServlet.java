package com.example.servletdemo.handlingSessionAttribute.p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session-validation")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        
        session.setAttribute("username", "<script>alert('XSS attack');</script>");
        session.setAttribute("email", "malicious@example.com");

        
        response.getWriter().println("Username: " + session.getAttribute("username") + "<br>");
        response.getWriter().println("Email: " + session.getAttribute("email"));
    }
}
