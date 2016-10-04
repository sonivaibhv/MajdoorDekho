package com.md.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Profile {
	@Id
	@GenericGenerator(name = "seq_id", strategy = "com.md.util.BookingNoGenerator")
	@GeneratedValue(generator = "seq_id")
	private String bookingNo;
	private String type;
	private String nkarigar;
	private String nbalider;
	private String place;
	
	
	public String getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNkarigar() {
		return nkarigar;
	}
	public void setNkarigar(String nkarigar) {
		this.nkarigar = nkarigar;
	}
	public String getNbalider() {
		return nbalider;
	}
	public void setNbalider(String nbalider) {
		this.nbalider = nbalider;
	}
	
	public Profile(String type, String nkarigar, String nbalider,
			String place) {
		super();
		this.type = type;
		this.nkarigar = nkarigar;
		this.nbalider = nbalider;
		this.place = place;
	}
	
public Profile() {
	// TODO Auto-generated constructor stub
}
}
