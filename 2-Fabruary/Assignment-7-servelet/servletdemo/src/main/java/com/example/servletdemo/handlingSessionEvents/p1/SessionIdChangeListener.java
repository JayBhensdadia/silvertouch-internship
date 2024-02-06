package com.example.servletdemo.handlingSessionEvents.p1;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionIdListener;

@WebListener
public class SessionIdChangeListener implements HttpSessionIdListener {
    @Override
    public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
        log("Session ID changed - Old Session ID: " + oldSessionId + ", New Session ID: " + event.getSession().getId());
    }

    private void log(String message) {
        
        System.out.println("[Session ID Change] " + message);
    }
}
