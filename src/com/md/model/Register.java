package com.md.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {
	@Id
	
	private String firstname;
	private String Lastname;
	private String DateOfBirth;
	private String gender;
	private String Mobileno;
	private String email;
	private String Address;
	private String city;
	private String state;
	private String worktype;
	private String year;
	
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getWorktype() {
		return worktype;
	}
	public void setWorktype(String worktype) {
		this.worktype = worktype;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Register(String firstname, String lastname, String dateOfBirth,
			String gender, String mobileno, String email, String address,
			String city, String state, String worktype, String year) {
		super();
		this.firstname = firstname;
		Lastname = lastname;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		Mobileno = mobileno;
		this.email = email;
		Address = address;
		this.city = city;
		this.state = state;
		this.worktype = worktype;
		this.year = year;
	}
	
	
	
	
	
	

}
