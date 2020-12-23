package com.binu.sample.myrestservice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.binu.sample.myrestservice.bean.Person;

@Service
public class PersonService {

	private static int personCount=3;
	
	private static List<Person> persons=new ArrayList<Person>();
	static {
		persons.add(new Person(1,"Mitesh"));
		persons.add(new Person(2,"Binu"));
		persons.add(new Person(3,"Peter"));
	}
		
	public List<Person> findAll(){
		return persons;
	}
	
	public Person findOne(int personId) {
		for(Person pers:persons) {
			if(pers.personId==personId)
				return pers;
		}
		 return null;
	}
	
	public Person deleteById(int personId) {
		
		Iterator<Person> iterator=persons.iterator();
		while(iterator.hasNext()) {
			Person person=iterator.next();
			if(person.getPersonId()==personId)
				iterator.remove();
			return person;
		}
		return null;		
	}
	
	
	public Person save(Person person)
	{
		if(person.getPersonId()==null) {
			person.setPersonId(++personCount);
		}
		persons.add(person);
		return person;
	}
	
	
	
}
