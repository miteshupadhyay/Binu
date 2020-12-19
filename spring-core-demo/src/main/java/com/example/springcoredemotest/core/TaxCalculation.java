package com.example.springcoredemotest.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculation {

	@Autowired
	private Tax incometax;
	
	
	public TaxCalculation(Tax tax) {
		this.incometax = tax;
	}


	public int payableTax() {
		
		int payableTax = incometax.payableTax();
		
		return payableTax;
	}
	
}
