package com.binu.sample.myrestservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.binu.sample.myrestservice.bean.Person;
import com.binu.sample.myrestservice.service.PersonJPAService;

@RestController
public class PersonJPAController {

	@Autowired
	private PersonJPAService service;
	
	@GetMapping("/db/persons")
	public List<Person> getAllPerson() {
		return service.findAll();
	}
	
	
	@GetMapping("/db/persons/{personId}")
	public Optional<Person> getPersonById(@PathVariable int personId) {
		return service.getPersonById(personId);
	}
	
}
