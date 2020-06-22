package com.rtbt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HospitalBeds {
	
	@Id
	private String email;
	
	private String HospitalName;
	
	private int totalICUBeds;
	
	private int avaialbleICUBeds;
	
	private int reservedICUBeds;
	
	private int totalNormalBeds;
	
	private int availableNormalBeds;
	
	private int totalOxygenSupportedBeds;
	
	private int avialableOxygenSupportedBeds;
	
	private int reservedOxygenSupportedBeds;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}

	public int getTotalICUBeds() {
		return totalICUBeds;
	}

	public void setTotalICUBeds(int totalICUBeds) {
		this.totalICUBeds = totalICUBeds;
	}

	public int getAvaialbleICUBeds() {
		return avaialbleICUBeds;
	}

	public void setAvaialbleICUBeds(int avaialbleICUBeds) {
		this.avaialbleICUBeds = avaialbleICUBeds;
	}

	public int getReservedICUBeds() {
		return reservedICUBeds;
	}

	public void setReservedICUBeds(int reservedICUBeds) {
		this.reservedICUBeds = reservedICUBeds;
	}

	public int getTotalNormalBeds() {
		return totalNormalBeds;
	}

	public void setTotalNormalBeds(int totalNormalBeds) {
		this.totalNormalBeds = totalNormalBeds;
	}

	public int getAvailableNormalBeds() {
		return availableNormalBeds;
	}

	public void setAvailableNormalBeds(int availableNormalBeds) {
		this.availableNormalBeds = availableNormalBeds;
	}

	public int getTotalOxygenSupportedBeds() {
		return totalOxygenSupportedBeds;
	}

	public void setTotalOxygenSupportedBeds(int totalOxygenSupportedBeds) {
		this.totalOxygenSupportedBeds = totalOxygenSupportedBeds;
	}

	public int getAvialableOxygenSupportedBeds() {
		return avialableOxygenSupportedBeds;
	}

	public void setAvialableOxygenSupportedBeds(int avialableOxygenSupportedBeds) {
		this.avialableOxygenSupportedBeds = avialableOxygenSupportedBeds;
	}

	public int getReservedOxygenSupportedBeds() {
		return reservedOxygenSupportedBeds;
	}

	public void setReservedOxygenSupportedBeds(int reservedOxygenSupportedBeds) {
		this.reservedOxygenSupportedBeds = reservedOxygenSupportedBeds;
	}
	
	

}
