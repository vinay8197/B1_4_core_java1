package com.tns.looping;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=n);

	}

}
