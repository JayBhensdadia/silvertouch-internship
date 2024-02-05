package com.example.servletdemo.handlingSessionEvents.p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session-id-change")
public class SessionIdChangeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Invalidate and re-create the session to trigger a session ID change
        session.invalidate();
        session = request.getSession(true);

        // For demonstration purposes, let's print a message to the response
        response.getWriter().println("Check the console for session ID change logs.");
    }
}
