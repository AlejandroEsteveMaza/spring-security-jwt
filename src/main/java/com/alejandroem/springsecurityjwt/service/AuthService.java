package com.alejandroem.springsecurityjwt.service;

import com.alejandroem.springsecurityjwt.dto.AuthResponse;
import com.alejandroem.springsecurityjwt.dto.LoginRequest;
import com.alejandroem.springsecurityjwt.dto.RegisterRequest;

public interface AuthService {

	AuthResponse login(LoginRequest request);

	AuthResponse register(RegisterRequest request);

}
