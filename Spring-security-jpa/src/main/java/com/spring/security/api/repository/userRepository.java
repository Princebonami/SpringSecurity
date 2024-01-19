package com.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.api.model.User;

public interface userRepository extends JpaRepository<User, Integer> {
	
	

}
