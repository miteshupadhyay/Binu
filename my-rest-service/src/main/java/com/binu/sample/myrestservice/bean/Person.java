package com.binu.sample.myrestservice.bean;

public class Person {

	
	public int personId;
	public String personName;
	public int getPersonId() {
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
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	
	
	
}
