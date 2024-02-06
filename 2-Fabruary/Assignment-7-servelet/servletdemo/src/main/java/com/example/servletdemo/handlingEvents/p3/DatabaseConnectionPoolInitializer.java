package com.example.servletdemo.handlingEvents.p3;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class DatabaseConnectionPoolInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        initializeDatabaseConnectionPool(sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        destroyDatabaseConnectionPool(sce.getServletContext());
    }

    private void initializeDatabaseConnectionPool(ServletContext servletContext) {
        
        
        System.out.println("Database connection pool initialized.");
    }

    private void destroyDatabaseConnectionPool(ServletContext servletContext) {
        
        
        System.out.println("Database connection pool destroyed.");
    }
}