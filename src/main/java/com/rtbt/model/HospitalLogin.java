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
	@OneToOne(mappedBy = "email")
	HospitalDetails hospitalDetails;
	@OneToOne(mappedBy = "email")
	HospitalBeds hospitalBeds;

	
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

	public HospitalDetails getHospitalDetails() {
		return hospitalDetails;
	}

	public void setHospitalDetails(HospitalDetails hospitalDetails) {
		this.hospitalDetails = hospitalDetails;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public HospitalBeds getHospitalBeds() {
		return hospitalBeds;
	}

	public void setHospitalBeds(HospitalBeds hospitalBeds) {
		this.hospitalBeds = hospitalBeds;
	}
	
	
	
}
