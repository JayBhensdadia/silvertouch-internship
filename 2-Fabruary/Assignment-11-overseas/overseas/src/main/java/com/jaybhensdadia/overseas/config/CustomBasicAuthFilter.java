package com.jaybhensdadia.overseas.config;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;



public class CustomBasicAuthFilter extends BasicAuthenticationFilter {


    public CustomBasicAuthFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    protected void onSuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, Authentication authResult) throws IOException {
        response.sendRedirect("/about");
    }
}
