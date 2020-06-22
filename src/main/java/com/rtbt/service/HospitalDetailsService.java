package com.rtbt.service;

import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

public interface HospitalDetailsService {

	HospitalDetails getDetails(String email);
	
	HospitalDetails addDetails(HospitalDetails details);
}
