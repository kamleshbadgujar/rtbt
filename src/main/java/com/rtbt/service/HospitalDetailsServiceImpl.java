package com.rtbt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtbt.dao.HospitalDetailsRepository;
import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

@Service
public class HospitalDetailsServiceImpl implements HospitalDetailsService {

	@Autowired
	private HospitalDetailsRepository repo;
	@Override
	public HospitalDetails getDetails(String email) {
		Optional<HospitalDetails> hospital = repo.findById(email);
		return hospital.get();
	}

	@Override
	public HospitalDetails addDetails(HospitalDetails details) {
		return repo.save(details);
	}

	@Override
	public void deleteHospitalDetails(String email) {
		Optional<HospitalDetails> hospital = repo.findById(email);
		repo.delete(hospital.get());		
	}

	@Override
	public HospitalDetails updateDetails(HospitalDetails updatedDetails) {
		Optional<HospitalDetails> details = repo.findById(updatedDetails.getEmail());
		if(details.isPresent()) {
			HospitalDetails newDetails = details.get();
			newDetails.setHospitalName(updatedDetails.getHospitalName());
			newDetails.setAddressLineOne(updatedDetails.getAddressLineOne());
			newDetails.setAddressLineTwo(updatedDetails.getAddressLineTwo());
			newDetails.setState(updatedDetails.getState());
			newDetails.setDistrict(updatedDetails.getDistrict());
			newDetails.setCity(updatedDetails.getCity());
			newDetails.setPinCode(updatedDetails.getPinCode());
			newDetails.setPrimaryPhoneNumber(updatedDetails.getPrimaryPhoneNumber());
			newDetails.setSecondaryPhoneNumber(updatedDetails.getSecondaryPhoneNumber());
			return newDetails;
		}
		return null;
	}

}
