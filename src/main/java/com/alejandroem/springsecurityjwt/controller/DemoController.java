package com.alejandroem.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class DemoController {
	
	@PostMapping("/demo")
	public String welcome() {
		return "welcome secure endpoint";
	}

}
