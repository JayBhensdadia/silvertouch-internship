package com.example.servletdemo.handlingSessionEvents.p2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/handling-session-events/session-change"}, asyncSupported = true)
public class SessionIdChangeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();

        
        if (session.isNew()) {
            
            handleSessionIdChange(session.getId());
        }

        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }

    private void handleSessionIdChange(String newSessionId) {
        
        
        System.out.println("[Session ID Change Filter] Session ID changed to: " + newSessionId);
    }
}
