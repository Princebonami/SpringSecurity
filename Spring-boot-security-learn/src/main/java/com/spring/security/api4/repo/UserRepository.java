package com.spring.security.api4.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.api4.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	//public User getByUserName(String userName);
	public User findByUsername(String username);

}
