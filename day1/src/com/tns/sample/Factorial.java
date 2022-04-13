package com.tns.sample;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
			
		}
		return fact(n-1)*n;
		
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(fact(num));
		s.close();

	}

}
