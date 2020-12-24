package com.binu.sample.myrestservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Person {

	@Id
	public Integer personId;
	
	@JsonIgnore
	public String personName;
	
	public Integer getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Person(Integer personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
}
