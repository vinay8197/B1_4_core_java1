package com.tns.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting10 {
	@Test
	void accept()
	
	{
		
		System.setProperty("1", "Vinay");
		Assumptions.assumingThat("Vinay".equals(System.getProperty("2")),null);
	}

}
