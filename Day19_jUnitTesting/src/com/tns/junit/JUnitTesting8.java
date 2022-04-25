package com.tns.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitTesting8 {
	@Test
	void print()
	{
		int a[]= {1};
		int b[]= {1};
		assertArrayEquals(a,b);
	}

}
