package com.tns.sample;
import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b=6;
		System.out.print(b+" ");
		for(int i=1;i<=n;i++) {
			 b=b+(5*i);
			System.out.print(b+" ");
		}
		s.close();
	}

}
