package com.tns.operater;

import java.util.Scanner;

public class Bitwise_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.print("Enter the number of bit shifting :");
		int shift=s.nextInt();		
		System.out.println("The And Gate :"+(a&b));
		System.out.println("The OR Gate :"+(a|b));
		System.out.println("XOR Gate "+(a^b));
		System.out.println("Right Shift of :"+a+" is "+(a>>shift));
		System.out.println("Left shift of :"+a+" is "+(a<<shift));
	
	

	}

}
