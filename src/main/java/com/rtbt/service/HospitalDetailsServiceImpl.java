package com.rtbt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtbt.dao.HospitalDetailsRepository;
import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

@Service
@Transactional
public class HospitalDetailsServiceImpl implements HospitalDetailsService {

	@Autowired
	private HospitalDetailsRepository repo;
	@Override
	public HospitalDetails getDetails(Integer hospitalId) {
		// TODO Auto-generated method stub
		Optional<HospitalDetails> hospital = repo.findById(hospitalId);
		return hospital.get();
	}

	@Override
	public HospitalDetails addDetails(HospitalDetails details) {
		// TODO Auto-generated method stub
		return repo.save(details);
	}

}
