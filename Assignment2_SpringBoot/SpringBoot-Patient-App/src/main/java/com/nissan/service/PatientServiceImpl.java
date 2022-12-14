package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IPatientDAO;
import com.nissan.model.Patient;

@Service
public class PatientServiceImpl implements IPatientService {

	@Autowired
	IPatientDAO patientDao;

	@Override
	public List<Patient> listAllPatients() {

		return patientDao.findAll();
	}

	@Override
	public Patient searchById(Integer _patientId) {

		Patient tempPatient = patientDao.searchById(_patientId);
		if (_patientId == tempPatient.getPatientId()) {
			return tempPatient;
		} else {
			return null;
		}

	}

	@Override
	@Transactional
	public Patient addPatient(Patient _newPatient) {

		return patientDao.save(_newPatient);
	}

	@Override
	public Patient updatePatient(Patient _patient) {

		return patientDao.save(_patient);

	}

	@Override
	public String deletePatient(Integer _patientId) {
		patientDao.deleteById(_patientId);
		return "Deleted Successfully";
		
		 //return patientDao.getById(_patientId);
	}

}
