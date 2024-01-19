package com.spring.security.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.api.model.User;
import com.spring.security.api.repository.userRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/secure/test")
@Slf4j
public class AdminController {
	
	@Autowired
	private userRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	// this method is for encrypt password
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		
		String pwd=user.getPassword();
		String encryp=passwordEncoder.encode(pwd);
		user.setPassword(encryp);
		log.info("Encrypted password = {}",encryp);
		userRepository.save(user);
		
		return "User addeed Successfully";
		
	}

}
