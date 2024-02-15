package com.alejandroem.springsecurityjwt.service;

import java.security.Key;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {

	public static final String SECRET_KEY = "97680P'`54F'9012365K0912346GD0921346HJ019W63V2134";

	public String getToken(UserDetails user);

	public String getToken(Map<String, Object> extraClaims, UserDetails user);

	public Key getKey();

}
