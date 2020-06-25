package com.rtbt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HospitalLogin implements Serializable {

	@Id
	@Column(name = "id")
	private String userName;
	
	private String password;
	
	public HospitalLogin()
    {

    }

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public HospitalLogin(String email, String password) {
        this.setUserName(email);
        this.setPassword(password);
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
