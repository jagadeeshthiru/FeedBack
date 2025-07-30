package com.example.BookingTable.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="booking")
public class Booking {

	  @Id
	   private String id;
	   
	   private String fname;
	   private String lname;
	   private String phone;
	   private String email;
	   private String date;
	   private String time;
	   private int numberOfPeople;
	   private int numberOfTables;
	   private String message;
	   
	   
	   public Booking(String id, String fname, String lname, String phone, String email, String date, String time,
			int numberOfPeople, int numberOfTables, String message) 
	   {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.date = date;
		this.time = time;
		this.numberOfPeople = numberOfPeople;
		this.numberOfTables = numberOfTables;
		this.message = message;
	   }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getNumberOfPeople() {
		return numberOfPeople;
	}


	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}


	public int getNumberOfTables() {
		return numberOfTables;
	}


	public void setNumberOfTables(int numberOfTables) {
		this.numberOfTables = numberOfTables;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	   
}
