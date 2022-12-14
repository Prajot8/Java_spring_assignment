package com.nissan.service;

import java.util.List;

import com.nissan.model.Professor;



public interface IProfessorService {

	// List All Patients
		List<Professor> listAllProfessor();
		
		//get Patient by ID
		Professor searchById (Integer _professorId);
		
		//Add a patient
		Professor addProfessor(Professor professor);

		//Update a patient
		Professor updateProfessor(Professor professor);
		
		//Delete a patient
		void deleteProfessor(Integer _professorId);
}
