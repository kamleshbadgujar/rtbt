package com.rtbt.service;

import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

public interface HospitalDetailsService {

	HospitalDetails getDetails(Integer hospitalId);
	
	HospitalDetails addDetails(HospitalDetails details);
}
