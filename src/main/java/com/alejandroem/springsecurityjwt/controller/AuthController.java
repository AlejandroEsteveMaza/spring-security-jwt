package com.alejandroem.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {
	
	@PostMapping("/login")
	public String login() {
		return "login public endpoint";
	}
	
	@PostMapping("/register")
	public String register() {
		return "register public endpoint";
	}
}