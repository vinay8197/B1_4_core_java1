package com.tns.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitTesting4 {
	@BeforeAll
	static void display()
	{
		System.out.println("vinay");
	}
	
	@Test
	void display1()
	{
		System.out.println("varun");
	}

}
