package com.md.model;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Signup {
	
  private String username;
 @Id
 private String email;
 private String password;
 private String conform;
 private String address;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConform() {
	return conform;
}
public void setConform(String conform) {
	this.conform = conform;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Signup( String username, String email, String password, String conform,
		String address) {
	super();
	
	this.username = username;
	this.email = email;
	this.password = password;
	this.conform = conform;
	this.address = address;
}
	
	


}

