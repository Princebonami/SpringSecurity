package com.spring.security.api4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.api4.models.User;
import com.spring.security.api4.services.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterUser {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/save")
	public String getRegistered(@RequestBody User user)
	{
		
		String password=  user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));
		String result=registerService.addUser(user);
		return result;
		
		
	}

}
