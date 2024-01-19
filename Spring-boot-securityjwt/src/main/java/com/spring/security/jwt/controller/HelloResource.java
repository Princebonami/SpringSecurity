package com.spring.security.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}

}