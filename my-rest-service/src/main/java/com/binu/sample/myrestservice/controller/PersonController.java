package com.binu.sample.myrestservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binu.sample.myrestservice.bean.Person;

@RestController
public class PersonController {

	
	//localhost:8080/persons
	
	@GetMapping("/persons")
	public String firstRequest() {
		return "Good Morning";
	}
	
	@GetMapping("/personsDetails")
	public Person getPersonDetail() {
		return new Person(101, "Mitesh");
	}
}
