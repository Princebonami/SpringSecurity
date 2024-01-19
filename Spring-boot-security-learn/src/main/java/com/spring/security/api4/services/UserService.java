package com.spring.security.api4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.api4.models.User;
import com.spring.security.api4.repo.UserRepository;

@Service
public class UserService {
	
//	List<User> list=new ArrayList<User>();
//	
//	public UserService()
//	{
//		list.add(new User("abc","abc","ABC@gmail.com"));
//		list.add(new User("xyz","abcxyz","XYZ@gmail.com"));
//			
//	}
//	
	@Autowired
	private UserRepository userRepository; 
	
	
	// get all user 
	public List<User> getAllUsers()
	{
		List<User> list=  userRepository.findAll();
		return list;
	}
	
	// get single user 
	
	public User getUser(String userName) 
	{
		//return list.stream().filter((user)->user.getUserName().equals(userName)).findAny().orElse(null);
		
		User user=userRepository.findByUsername(userName);
		return user;
	}
	public User addUser(User user)
	{
	   User user1=userRepository.save(user);
	   return user1;
	}

}
