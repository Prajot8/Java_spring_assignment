package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Professor;

@Repository
public interface IProfessorDAO extends JpaRepositoryImplementation<Professor, Integer> {

	        //FindAll()
			//save
			//deleteById()
			//custom methods  --JPQL---HQL
			@Query("from Professor where professorId=?1")
			public Professor searchById(Integer _professorId);
}
