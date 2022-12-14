package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nissan.model.Professor;
import com.nissan.service.IProfessorService;

@RestController
@RequestMapping("api/")
public class ProfessorController {

	@Autowired
	IProfessorService professorService;
	
	@GetMapping("professor")
	public List<Professor> getAllProfessor() {
		// TODO Auto-generated method stub
		return professorService.listAllProfessor();
	}
	
	//Get a professor by professorID
		@GetMapping("professor/{professorId}")
		public Professor searchById (@PathVariable Integer professorId) {
			return professorService.searchById(professorId);
		}
		
		//add New Professor
		@PostMapping("professor")
		public Professor addNewProfessor(@RequestBody Professor _newProfessor) {
			return professorService.addProfessor(_newProfessor);
		}
		
		//Update a Professor
		@PutMapping("professor")
	    public Professor updateProfessor(@RequestBody Professor professor) {
	    		
	    		return professorService.updateProfessor(professor);
	    	}
		
		//Delete a Professor
		@DeleteMapping("professor/{_professorId}")
		public String deleteProfessor(@PathVariable Integer _professorId) {
			professorService.deleteProfessor(_professorId);
			return "Deleted Sucessfully...";
		}
}
