package com.spring.security.api2.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWebSecurity
@RequestMapping("/rest/auth")
public class ApplicationController {
	
	@GetMapping("/getMsg")
	public String greeting()
	{
		return "spring security example";
	}

}
