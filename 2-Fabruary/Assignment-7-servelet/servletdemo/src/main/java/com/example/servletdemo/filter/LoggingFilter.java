package com.example.servletdemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
@WebFilter(urlPatterns = {"/filter/logging-filter"}, asyncSupported = true)
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Request Initialize");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Request received");
        chain.doFilter(request, response);
        System.out.println("Response sent " );
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}