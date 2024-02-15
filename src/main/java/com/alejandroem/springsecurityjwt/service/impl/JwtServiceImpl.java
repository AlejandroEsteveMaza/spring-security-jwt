package com.alejandroem.springsecurityjwt.service.impl;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.alejandroem.springsecurityjwt.service.JwtService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtServiceImpl implements JwtService {

	@Override
	public String getToken(UserDetails user) {
		return getToken(new HashMap<>(), user);
	}

	@Override
	public String getToken(Map<String, Object> extraClaims, UserDetails user) {

		return Jwts
				.builder()
				.setClaims(extraClaims)
				.setSubject(user.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
				.signWith(getKey(), SignatureAlgorithm.HS256)
				.compact();
	}

	@Override
	public Key getKey() {
		byte[] keyBytes=Decoders.BASE64.decode(SECRET_KEY);
		return 	Keys.hmacShaKeyFor(keyBytes);
	}

}
