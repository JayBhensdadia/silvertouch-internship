package com.example.servletdemo.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        System.out.println("Web application is starting. Performing initialization tasks...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        System.out.println("Web application is shutting down. Performing cleanup tasks...");
    }
}