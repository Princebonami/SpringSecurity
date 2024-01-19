package com.spring.security.api4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.api4.models.User;
import com.spring.security.api4.repo.RegistryRepo;

@Service
public class RegisterService {
	
	@Autowired
	private RegistryRepo registryRepo;
	
	public String addUser(User user)
	{
		registryRepo.save(user);
		return "User Registered Successfully";
	}

}
