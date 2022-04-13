package com.tns.sample;
import java.util.Scanner;
public class Square_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=11;
		for(int i=1;i<=n;i++) {
			int b=(a*a);
			System.out.print(b+" ");
			a=a+4;
		}
		s.close();
		

	}

}
