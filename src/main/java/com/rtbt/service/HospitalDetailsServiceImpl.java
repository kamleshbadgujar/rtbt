package com.rtbt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtbt.dao.HospitalDetailsRepository;
import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

@Service
public class HospitalDetailsServiceImpl implements HospitalDetailsService {

	@Autowired
	private HospitalDetailsRepository repo;
	@Override
	public HospitalDetails getDetails(String email) {
		// TODO Auto-generated method stub
		Optional<HospitalDetails> hospital = repo.findById(email);
		return hospital.get();
	}

	@Override
	public HospitalDetails addDetails(HospitalDetails details) {
		// TODO Auto-generated method stub
		return repo.save(details);
	}

}
