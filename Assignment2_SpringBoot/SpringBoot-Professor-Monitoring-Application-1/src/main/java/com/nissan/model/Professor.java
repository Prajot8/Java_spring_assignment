package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblprofessor")
public class Professor {

	
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer professorId;
	private Integer managerId;
	
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	private Integer deptNo;
	private Double salary;
	private LocalDate joiningDate;
	private LocalDate dateOfBirth;
	@Column(nullable=false)
	private String gender;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer professorId, Integer managerId, String firstName, String lastName, Integer deptNo,
			Double salary, LocalDate joiningDate, LocalDate dateOfBirth, String gender) {
		super();
		this.professorId = professorId;
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptNo = deptNo;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", managerId=" + managerId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", deptNo=" + deptNo + ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + "]";
	}
	
	
	
}
