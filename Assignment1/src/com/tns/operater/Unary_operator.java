package com.tns.operater;

import java.util.Scanner;

public class Unary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number to increment and decrement operation:");
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("The pre increment value of "+a+" is:"+(++a)+"\n The post increment value of  "+a+" is :"+(a++));
		System.out.println("The pre decrement value of "+a+" is "+(--a)+"\n The post decrement value of "+a+" is "+(a--));
		s.close();
		

	}

}
