package com.binu.sample.myrestservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binu.sample.myrestservice.bean.Person;
import com.binu.sample.myrestservice.repository.PersonRepository;

@Service
public class PersonJPAService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> findAll(){
		return personRepository.findAll();
	} 
	
	public Optional<Person> getPersonById(int personId) {
		return personRepository.findById(personId);
	}
	
	
}
