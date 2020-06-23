package com.rtbt.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;

public interface HospitalLoginRepository extends JpaRepository<HospitalLogin, String> {

	 Optional<HospitalLogin> findByUserName(String email);
}
