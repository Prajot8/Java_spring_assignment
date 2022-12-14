package com.nissan.service;

import java.util.List;

import com.nissan.model.Patient;

public interface IPatientService {
	/*
	• Get a list of patients
	• Get a single patient by id
	• Add a new patient
	• Update a patient
	• Delete a patient
	*/
	List<Patient> listAllPatients();
	
	Patient searchById(Integer _patientId);

	Patient addPatient(Patient _newPatient);

	Patient updatePatient(Patient _patient);

	String deletePatient(Integer _patientId);
	
	
	
}
