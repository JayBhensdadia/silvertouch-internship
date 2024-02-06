package com.example.servletdemo.securityMeasures;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Base64;

@WebFilter(urlPatterns = "/security-measures/crs-filter",asyncSupported = true)
public class CsrfFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        
        if (httpRequest.getMethod().equalsIgnoreCase("POST")) {
            
            if (!isValidCsrfToken(httpRequest)) {
                httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN, "Invalid CSRF token");
                return;
            }
        }

        
        chain.doFilter(request, response);

        
        updateCsrfToken(httpRequest);
    }

    @Override
    public void destroy() {
        
    }

    private boolean isValidCsrfToken(HttpServletRequest request) {
        HttpSession session = request.getSession(false);

        if (session != null) {
            
            String sessionCsrfToken = (String) session.getAttribute("csrfToken");

            
            String requestCsrfToken = request.getParameter("csrfToken");

            
            return sessionCsrfToken != null && sessionCsrfToken.equals(requestCsrfToken);
        }

        return false;
    }

    private void updateCsrfToken(HttpServletRequest request) {
        HttpSession session = request.getSession(true);

        
        String csrfToken = generateCsrfToken();

        
        session.setAttribute("csrfToken", csrfToken);

        
        request.setAttribute("csrfToken", csrfToken);
    }

    private String generateCsrfToken() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[32];
        random.nextBytes(bytes);
        return Base64.getEncoder().encodeToString(bytes);
    }
}