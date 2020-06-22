package com.rtbt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtbt.model.HospitalBeds;
import com.rtbt.model.HospitalLogin;

public interface HospitalBedsRepository extends JpaRepository<HospitalBeds, Integer> {

}
