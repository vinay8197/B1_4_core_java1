package com.tns.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5 {
	@Test
	void accept()
	{
		System.setProperty("1", "Vinay");
		Assumptions.assumeFalse("Vinay".equals(System.getProperty("2")));
		
	}

}
