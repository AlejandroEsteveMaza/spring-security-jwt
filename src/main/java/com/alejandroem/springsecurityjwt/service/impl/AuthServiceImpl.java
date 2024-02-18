package com.alejandroem.springsecurityjwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.alejandroem.springsecurityjwt.dto.AuthResponse;
import com.alejandroem.springsecurityjwt.dto.LoginRequest;
import com.alejandroem.springsecurityjwt.dto.RegisterRequest;
import com.alejandroem.springsecurityjwt.entity.Role;
import com.alejandroem.springsecurityjwt.entity.User;
import com.alejandroem.springsecurityjwt.repository.UserRepository;
import com.alejandroem.springsecurityjwt.service.AuthService;
import com.alejandroem.springsecurityjwt.service.JwtService;
import org.springframework.security.core.userdetails.UserDetails;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

	@Autowired
	UserRepository userRepository;
	@Autowired
	JwtService jwtService;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired AuthenticationManager authenticationManager;
	
	@Override
	public AuthResponse login(LoginRequest request) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
            .token(token)
            .build();
	}

	@Override
	public AuthResponse register(RegisterRequest request) {
		 User user = User.builder()
		            .username(request.getUsername())
		            .password(passwordEncoder.encode( request.getPassword()))
		            .firstname(request.getFirstname())
		            .lastname(request.getLastname())
		            .country(request.getCountry())
		            .role(Role.USER)
					.build();

			userRepository.save(user);
		return AuthResponse.builder().token(null).build();
	}

}
