package com.tns.decision;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		
		if(a>b) {
			System.out.println("The given numer "+a+" is Greater ");
			
		}
		else {
			System.out.println("The given numer "+b+" is Greater ");
		}
		s.close();

	}

}
