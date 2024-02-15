package com.alejandroem.springsecurityjwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandroem.springsecurityjwt.dto.AuthResponse;
import com.alejandroem.springsecurityjwt.dto.LoginRequest;
import com.alejandroem.springsecurityjwt.dto.RegisterRequest;
import com.alejandroem.springsecurityjwt.entity.Role;
import com.alejandroem.springsecurityjwt.entity.User;
import com.alejandroem.springsecurityjwt.repository.UserRepository;
import com.alejandroem.springsecurityjwt.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public AuthResponse login(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthResponse register(RegisterRequest request) {
		User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .country(request.getCountry())
                .role(Role.USER)
                .build();
		
		userRepository.save(user);
		return AuthResponse.builder().token(null).build();
	}

}
