package com.rtbt.service;

import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

public interface HospitalDetailsService {

	public HospitalDetails getDetails(String email);
	
	public HospitalDetails addDetails(HospitalDetails details);

	public void deleteHospitalDetails(String email);
	
	public HospitalDetails updateDetails(HospitalDetails updatedDetails);
}
