package com.example.springcoredemotest.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class IncomeTax implements Tax{

	public int payableTax() {
		System.out.println("Income tax is 5000");
		return 5000;
	}
	
	
}
