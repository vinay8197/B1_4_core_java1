package com.tns.decision;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		
		
		if(a>b & a>c) {
			System.out.println("The given numer "+a+" is Greater ");
			
		}
		else if(b>a & b>c) {
			System.out.println("The given numer "+b+" is Greater ");
		}
		else {
			System.out.println("The given numer "+c+ " is Greater");
		}
		s.close();

	}

}
