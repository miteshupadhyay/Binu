package com.binu.sample.myrestservice.bean;

public class Person {

	
	public Integer personId;
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
