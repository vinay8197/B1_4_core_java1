package com.tns.operater;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer to find unicode charecter :");
		int a=s.nextInt();
		char c=(char)a;
		System.out.println("The out put of unicode  "+a+" charecter is "+c);
		System.out.println("Enter the   charecter to find unicode number :");
		char c1=s.next().charAt(0);
		int a1=c1;
		System.out.println("The out put of charecter "+c1+" Unicode value is "+a1);
		
		
		
		
		s.close();
		

	}

}
