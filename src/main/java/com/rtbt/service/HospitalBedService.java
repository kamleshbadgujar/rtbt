package com.rtbt.service;

import com.rtbt.model.HospitalBeds;

public interface HospitalBedService {

	public HospitalBeds getBedDetails(String email);

	public HospitalBeds addBedDetails(HospitalBeds bedDetails);
	
	public HospitalBeds updateBedDetails(HospitalBeds updatedbedDetails); 
	
	public void deleteBedDetails(String email);

}
