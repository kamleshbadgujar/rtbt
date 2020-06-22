package com.rtbt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HospitalDetails {


//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "email_id", referencedColumnName = "id")
	@OneToOne
	private HospitalLogin email;
	
	@Id
	private String hospitalName;
	
	private String addressLineOne;
	
	private String addressLineTwo;
	
	private String state;
	
	private String district;
	
	private String city;
	
	private int pinCode;
	
	private long primaryPhoneNumber;
	
	private long secondaryPhoneNumber;

	public HospitalLogin getEmail() {
		return email;
	}

	public void setEmail(HospitalLogin email) {
		this.email = email;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public long getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	public void setPrimaryPhoneNumber(long primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	public long getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	public void setSecondaryPhoneNumber(long secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
	}
}
