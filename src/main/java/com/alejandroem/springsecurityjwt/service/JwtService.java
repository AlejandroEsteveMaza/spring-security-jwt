package com.alejandroem.springsecurityjwt.service;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;

public interface JwtService {

	public static final String SECRET_KEY = "97680P54F9012365K0912346GD0921346HJ019W63V2134";

	public String getToken(UserDetails user);

	public String getToken(Map<String, Object> extraClaims, UserDetails user);

	public Key getKey();

	public String getUsernameFromToken(String token);

	public boolean isTokenValid(String token, UserDetails userDetails);

	public Claims getAllClaims(String token);

	public <T> T getClaim(String token, Function<Claims, T> claimsResolver);

	public Date getExpiration(String token);

	public boolean isTokenExpired(String token);
}
