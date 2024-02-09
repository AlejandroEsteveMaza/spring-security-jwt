package com.alejandroem.springsecurityjwt.jwt;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class jwtAuthenticationFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String token = getTokenFromRequest(request);
		
		if (token == null) {
			filterChain.doFilter(request, response);
			return;
		}
		
		filterChain.doFilter(request, response);
		
	}

	private String getTokenFromRequest(HttpServletRequest request) {
		final String authHeather = request.getHeader(HttpHeaders.AUTHORIZATION);
		
		if (StringUtils.hasText(authHeather)&& authHeather.startsWith("Bearer ")) {
			return authHeather.substring(7);
		}
		return null;
	}

}
