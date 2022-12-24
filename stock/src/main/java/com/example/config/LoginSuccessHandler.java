package com.example.config;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.util.StringUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		boolean hasRole=authentication.getAuthorities().stream().anyMatch(x->x.getAuthority().equals("ROLE_ADMIN"));
		
		String redirectURL=request.getContextPath();
		if(hasRole)
			redirectURL="/AdminHome";
		else
			
			redirectURL="/EmployeeHome";
		
		response.sendRedirect(redirectURL);
	}
	
}
