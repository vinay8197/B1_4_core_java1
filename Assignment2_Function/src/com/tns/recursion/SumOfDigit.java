package com.tns.recursion;

import java.util.Scanner;

public class SumOfDigit {
	
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int d=n%10;
		return d+sum(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find the sumofdigit value:");
		int n=s.nextInt();
		System.out.println("The sum of digit value of "+n+" is :"+sum(n));
		s.close();

	}

}
