package com.tns.recursion;

import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		if(n==0 | n==1) {
			return 1;
		}
		
		return n*fact(n-1);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find the factorial value :");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("The Factorial value of "+n+" is :"+fact(n));
		s.close();
		

	}

}
