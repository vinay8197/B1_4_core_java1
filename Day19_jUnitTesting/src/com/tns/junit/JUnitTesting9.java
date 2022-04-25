package com.tns.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting9 {
	@Test
	void accept()
	{
		System.setProperty("1", "Vinay");
		Assumptions.assumeTrue("Vinay".equals(System.getProperty("1")));
		
	}


}
