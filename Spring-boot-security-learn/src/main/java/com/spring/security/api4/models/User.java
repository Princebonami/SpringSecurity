package com.spring.security.api4.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String username;
	private String password;
//	private boolean active;
	private String roles;
	
//	public User() {
//		super();
//	}
	
	
//	public User(String userName, String password, String email) {
//		super();
//		this.userName = userName;
//		this.password = password;
//		this.email = email;
//	}
//
//
//	public String getUserName() {
//		return userName;
//	}
//
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//	@Override
//	public String toString() {
//		return "User [userName=" + userName + ", password=" + password + ", email=" + email + "]";
//	}
//	
	

}
