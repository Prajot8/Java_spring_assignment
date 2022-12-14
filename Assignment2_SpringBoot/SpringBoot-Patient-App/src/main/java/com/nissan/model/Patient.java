package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="tblpatient")
public class Patient {
	//instance variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	
	@Column(nullable=false)
	private Integer registrationNo;
	@Column(nullable=false)
	private String patientName;
	private LocalDate dob;
	private String gender;
	private String  address;
	@Column(nullable=false)
	private String phoneNo;
	
	//default constructor
	public Patient() {
		
	}

	//parameterized constructor
	public Patient(Integer patientId, Integer registrationNo, String patientName, LocalDate dob, String gender,
			String address, String phoneNo) {
		
		this.patientId = patientId;
		this.registrationNo = registrationNo;
		this.patientName = patientName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	//getters & setters
	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Integer registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	//override toString
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", registrationNo=" + registrationNo + ", patientName=" + patientName
				+ ", Dob=" + dob + ", gender=" + gender + ", Address=" + address + ", PhoneNo=" + phoneNo + "]";
	}
	
	
	
}
