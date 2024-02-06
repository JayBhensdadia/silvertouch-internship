package com.example.servletdemo.handlingEvents.p3;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/databaseServlet")
public class DatabaseServlet extends HttpServlet {


    private DataSource dataSource;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            Connection connection = dataSource.getConnection();

            
            
            response.getWriter().println("Connected to the database successfully!");

            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error connecting to the database: " + e.getMessage());
        }
    }
}