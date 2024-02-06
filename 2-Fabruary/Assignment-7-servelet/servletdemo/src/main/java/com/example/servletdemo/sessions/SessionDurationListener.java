package com.example.servletdemo.sessions;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionDurationListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        
        HttpSession session = se.getSession();
        session.setAttribute("startTime", System.currentTimeMillis());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        
        HttpSession session = se.getSession();
        long startTime = (long) session.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        
        System.out.println("User with session ID " + session.getId() + " spent " + duration + " milliseconds on the website.");
    }
}
