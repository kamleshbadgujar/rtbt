package com.rtbt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HospitalLogin {

	@Id
//	 @Column(name = "id")
	private String email;
	
	private String password;


	
	
	
	public String getEmailId() {
		return email;
	}

	public void setEmailId(String emailId) {
		this.email = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
