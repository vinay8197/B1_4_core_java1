package com.tns.operater;

import java.util.Scanner;

public class logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter true of false as a input:");
		Scanner s=new Scanner(System.in);
		boolean a=s.nextBoolean();
		boolean b=s.nextBoolean();
		System.out.println("Logical OR gate:"+(a||b));
		System.out.println("Logical AND gate:"+(a&&b));
		System.out.println("Logical NOT gate:"+!(a||b));
		s.close();

	}

}
