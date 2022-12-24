package com.example.citizen.rest.model;

import java.time.Instant;

public class Citizen {

	private String name;
	private String surname;
	private Instant birthDate;
	private String motherName;
	private String fatherName;
	private String NINumber;
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", motherName="
				+ motherName + ", fatherName=" + fatherName + ", NINumber=" + NINumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Instant getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getNINumber() {
		return NINumber;
	}
	public void setNINumber(String nINumber) {
		NINumber = nINumber;
	}
	
	
	
}
