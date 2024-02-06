package com.example.servletdemo.advanceSessionManagement;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@WebFilter(urlPatterns = "/advanced-session-management/session-fixation",asyncSupported = true)
public class SessionFixationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession();

        
        if (session.getAttribute("sessionIdValidated")!=null && (session.isNew() ||   !session.getAttribute("sessionIdValidated").equals("true"))) {
            
            String newSessionId = generateNewSessionId();

            
            Enumeration<String> attributeNames = session.getAttributeNames();
            Map<String, Object> attributes = new HashMap<>();

            while (attributeNames.hasMoreElements()) {
                String attributeName = attributeNames.nextElement();
                attributes.put(attributeName, session.getAttribute(attributeName));
            }

            
            session.invalidate();
            session = httpRequest.getSession(true);

            
            for (Map.Entry<String, Object> entry : attributes.entrySet()) {
                session.setAttribute(entry.getKey(), entry.getValue());
            }

            
            session.setAttribute("sessionIdValidated", "true");

            
            httpResponse.setHeader("Set-Cookie", "JSESSIONID=" + newSessionId + "; HttpOnly; SameSite=Strict");
        }

        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }

    private String generateNewSessionId() {
        
        return UUID.randomUUID().toString().replace("-", "");
    }
}