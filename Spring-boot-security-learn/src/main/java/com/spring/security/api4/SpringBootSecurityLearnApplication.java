package com.spring.security.api4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.spring.security.api4.repo.UserRepository;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootSecurityLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLearnApplication.class, args);
	}

}
