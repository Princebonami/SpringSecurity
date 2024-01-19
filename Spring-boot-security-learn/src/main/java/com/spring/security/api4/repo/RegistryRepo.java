package com.spring.security.api4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.api4.models.User;

public interface RegistryRepo extends JpaRepository<User, Integer> {

}
