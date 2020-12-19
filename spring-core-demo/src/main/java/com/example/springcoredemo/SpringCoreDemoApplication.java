package com.example.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.springcoredemotest.core.HomeTax;
import com.example.springcoredemotest.core.TaxCalculation;

@SpringBootApplication
@ComponentScan("com.example.springcoredemotest.core")
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		//What are the beans
		// What are the dependencies
		// Where to look to the beans
		
		//Activated the Container
		ApplicationContext context=SpringApplication.run(SpringCoreDemoApplication.class, args);
		
		TaxCalculation calculation=context.getBean(TaxCalculation.class);
		
		int payableTax = calculation.payableTax();
		
		System.out.println(payableTax);
	}

}
