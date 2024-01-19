package com.spring.security.api4.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.api4.models.CustomUserDetail;
import com.spring.security.api4.models.User;
import com.spring.security.api4.repo.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user= userRepository.findByUsername(username);
		
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		return  new CustomUserDetail(user);
		
	}
	

}
