package com.binu.sample.myrestservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binu.sample.myrestservice.bean.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
