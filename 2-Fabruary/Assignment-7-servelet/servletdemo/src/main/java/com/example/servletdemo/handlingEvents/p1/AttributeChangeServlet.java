package com.example.servletdemo.handlingEvents.p1;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/attribute-change")
public class AttributeChangeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");

        
        HttpSession session = request.getSession(true);

        
        AttributeChangeListener listener = new AttributeChangeListener("exampleAttribute");

        
        session.setAttribute("exampleAttribute", listener);

        
        session.setAttribute("exampleAttribute", "new value");

        
        session.removeAttribute("exampleAttribute");
    }
}