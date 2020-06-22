package com.rtbt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HospitalLogin {

	@Id
	@Column(name = "id")
	private String email;
	
	private String password;
	@OneToOne(mappedBy = "email")
	HospitalDetails hospitalDetails;
	@OneToOne(mappedBy = "email")
	HospitalBeds hospitalBeds;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
