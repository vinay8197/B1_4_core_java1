package com.tns.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitTesting2 {
	@Test
	void print()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
	
	@Test
	void print1()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}

}
