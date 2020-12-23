package com.binu.sample.myrestservice.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.binu.sample.myrestservice.bean.Person;
import com.binu.sample.myrestservice.exception.PersonNotFoundException;
import com.binu.sample.myrestservice.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	//localhost:8080/persons
	
	@GetMapping("/persons")
	public List<Person> firstRequest() {
		return personService.findAll();
	}
	
	@GetMapping("/persons/{personId}")
	public Person getPersonDetail(@PathVariable int personId) {
		Person person = personService.findOne(personId);
		if(person==null)
			throw new PersonNotFoundException("Entered Person Id "+personId+" is not available in our record");
		return person;
	}
	
	@PostMapping("persons")
	public ResponseEntity<Object> save(@RequestBody Person person) {
		
		Person savedPerson = personService.save(person);
		
		URI finalURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedPerson.getPersonId()).toUri();
		
		
		return ResponseEntity.created(finalURI).build();
	}
	
	@DeleteMapping("/persons/{personId}")
	public void delete(@PathVariable int personId) {
		Person person = personService.deleteById(personId);
		if(person==null)
			throw new PersonNotFoundException("Entered Person Id that you want to delete "+personId+" is not available in our record");
	}
}
