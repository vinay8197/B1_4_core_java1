package com.tns.decision;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=14) {
			if(weight>=40) {
				if(weight<=110) {
					System.out.println("You are eligibele to donate the blood");
				}
				else {
					System.out.println("You are Not eligibele to weight is more");
				}
				
				
			}else {
				System.out.println("You are Not eligibele to weight is less");
			}
		}
		else {
			System.out.println("You are Not eligibele to Age is Less");
		}

	}

}
