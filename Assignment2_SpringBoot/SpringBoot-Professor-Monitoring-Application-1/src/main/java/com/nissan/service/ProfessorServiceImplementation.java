package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IProfessorDAO;
import com.nissan.model.Professor;

@Service
public class ProfessorServiceImplementation implements IProfessorService {

	@Autowired
	IProfessorDAO professorDAO; //creating the objects automatically
	
	//get all professors
	@Override
	public List<Professor> listAllProfessor() {
		// TODO Auto-generated method stub
		return professorDAO.findAll();
	}

	//search professor by ID
	@Override
	public Professor searchById(Integer _professorId) {
		Professor professor = professorDAO.searchById(_professorId);
		if(_professorId == (professor.getProfessorId()))
		{
			return professor;
		}else {
			return null;
		}
	}

	//add a professor
	@Transactional
	@Override
	public Professor addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return professorDAO.save(professor);
	}
	
	//update a professor record

	@Override
	public Professor updateProfessor(Professor professor) {
		
		Professor searchProfessor = professorDAO.searchById(professor.getProfessorId());
    	if(searchProfessor == null) {
    		return null;
    	}else {
    		searchProfessor.setManagerId(professor.getManagerId());
    		searchProfessor.setFirstName(professor.getFirstName());
    		searchProfessor.setLastName(professor.getLastName());
    		searchProfessor.setDeptNo(professor.getDeptNo());
    		searchProfessor.setSalary(professor.getSalary());
    		searchProfessor.setJoiningDate(professor.getJoiningDate());
    		searchProfessor.setDateOfBirth(professor.getDateOfBirth());
    		searchProfessor.setGender(professor.getGender());
    		
    		
    		
    		return professorDAO.save(searchProfessor);
    	}
	}

	//delete a professor
	@Override
	public void deleteProfessor(Integer _professorId) {
		// TODO Auto-generated method stub
		Professor professorDeleted = professorDAO.getById(_professorId);
		professorDAO.delete(professorDeleted);

	}

}
