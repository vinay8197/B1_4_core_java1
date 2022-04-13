package com.tns.exception;

public class Example4 {
	static void display(int age,int weight) {
		if(age>18 & weight>50) {
			System.out.println("eligeble");
			
		}
		else {
			throw new ArithmeticException("Not eligeble");
		}
		
	}

	public static void main(String[] args) {
		display(10,50);
		// TODO Auto-generated method stub
		System.out.println("Exception handling");

	}

}
