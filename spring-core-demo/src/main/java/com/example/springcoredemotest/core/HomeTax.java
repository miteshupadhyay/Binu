package com.example.springcoredemotest.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HomeTax implements Tax{

	public int payableTax() {
		System.out.println("Home tax is 2000");
		return 2000;
	}
	
	
}
