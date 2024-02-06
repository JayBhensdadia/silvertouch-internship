package com.example.servletdemo.asyncronousProcessing;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(urlPatterns = "/async-processing/async-filter",asyncSupported = true)
public class AsyncRequestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        setAsyncHeaders((HttpServletResponse) response);

        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }

    private void setAsyncHeaders(HttpServletResponse response) {
        response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
    }
}