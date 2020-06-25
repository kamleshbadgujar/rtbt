package com.rtbt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtbt.dao.HospitalBedsRepository;
import com.rtbt.model.HospitalBeds;

@Service
public class HospitalBedServiceImpl implements HospitalBedService{

	@Autowired
	private HospitalBedsRepository repo;
	@Override
	public HospitalBeds getBedDetails(String email) {
		Optional<HospitalBeds> bedDetails = repo.findById(email);
		return bedDetails.get();
	}

	@Override
	public HospitalBeds addBedDetails(HospitalBeds bedDetails) {
		return repo.save(bedDetails);
	}

	@Override
	public void deleteBedDetails(String email) {
		Optional<HospitalBeds> bedDetails = repo.findById(email);
		repo.delete(bedDetails.get());
	}

	@Override
	public HospitalBeds updateBedDetails(HospitalBeds updatedbedDetails) {
		Optional<HospitalBeds> bedDetails = repo.findById(updatedbedDetails.getEmail());
		if(bedDetails.isPresent()) {
			HospitalBeds updatedDetails = bedDetails.get();
			updatedDetails.setTotalICUBeds(updatedbedDetails.getTotalICUBeds());
			updatedDetails.setAvaialbleICUBeds(updatedbedDetails.getAvaialbleICUBeds());
			updatedDetails.setReservedICUBeds(updatedbedDetails.getReservedICUBeds());
			updatedDetails.setTotalNormalBeds(updatedbedDetails.getTotalNormalBeds());
			updatedDetails.setAvailableNormalBeds(updatedbedDetails.getAvailableNormalBeds());
			updatedDetails.setTotalOxygenSupportedBeds(updatedbedDetails.getTotalOxygenSupportedBeds());
			updatedDetails.setAvialableOxygenSupportedBeds(updatedbedDetails.getAvialableOxygenSupportedBeds());
			updatedDetails.setReservedOxygenSupportedBeds(updatedbedDetails.getReservedOxygenSupportedBeds());
			return updatedDetails;
		}
		return null;
		
	}

}
