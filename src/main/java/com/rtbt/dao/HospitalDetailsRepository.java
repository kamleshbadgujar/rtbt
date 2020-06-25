package com.rtbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

public interface HospitalDetailsRepository extends JpaRepository<HospitalDetails, String> {

}
