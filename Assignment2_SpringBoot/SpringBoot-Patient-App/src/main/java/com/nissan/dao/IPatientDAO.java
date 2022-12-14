package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nissan.model.Patient;

@Repository
public interface IPatientDAO extends JpaRepository<Patient, Integer>{
	
	@Query("from Patient where patientId=?1")
	public Patient searchById(Integer _patientId);
	
	/*
	• Get a list of patients
	• Get a single patient by id
	• Add a new patient
	• Update a patient
	• Delete a patient
	*/
	
	
}
