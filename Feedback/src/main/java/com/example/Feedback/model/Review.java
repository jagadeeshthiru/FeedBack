package com.example.Feedback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="booking")
public class Review 
{
	 @Id
	   private String id;
	   private String fname;
	   private String lname;
	   private String phone;
	   private String email;
	   private String message;
	   
	public Review(String id, String fname, String lname, String phone, String email, String message) 
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.message = message;
	}

	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}

	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}

	public String getLname() 
	{
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}

	@Override
	public String toString() 
	{
		return "Review [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email
				+ ", message=" + message + "]";
	}
	
}
