package com.tns.Array;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter array element:");
			a[i]=s.nextInt();
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
		s.close();

	}

}
