package com.example.servletdemo.advanceSessionManagement;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionTimeoutListener implements HttpSessionListener {

    private static final int MAX_IDLE_TIME_SECONDS = 300; 

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        
    }

    private void logoutUser(HttpSession session) {
        
        
        session.invalidate();

        
    }

    public static boolean isSessionIdle(HttpSession session) {
        long lastAccessedTime = session.getLastAccessedTime();
        long currentTime = System.currentTimeMillis();
        long idleTime = currentTime - lastAccessedTime;

        return idleTime >= (MAX_IDLE_TIME_SECONDS * 1000);
    }
}