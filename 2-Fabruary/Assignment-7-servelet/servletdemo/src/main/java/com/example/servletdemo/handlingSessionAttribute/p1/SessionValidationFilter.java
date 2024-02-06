package com.example.servletdemo.handlingSessionAttribute.p1;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/handling-session-attribute/session-validation"}, asyncSupported = true)
public class SessionValidationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();

        
        validateAndSanitizeAttribute(session, "username");
        validateAndSanitizeAttribute(session, "email");

        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    private void validateAndSanitizeAttribute(HttpSession session, String attributeName) {
        Object attributeValue = session.getAttribute(attributeName);

        
        if (attributeValue instanceof String) {
            
            String sanitizedValue = sanitizeString((String) attributeValue);

            
            session.setAttribute(attributeName, sanitizedValue);
        }
    }

    private String sanitizeString(String input) {
        
        
        return input.replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;");
    }
}
