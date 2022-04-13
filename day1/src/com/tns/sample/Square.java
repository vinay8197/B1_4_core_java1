package com.tns.sample;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int b=(i*i);
			System.out.print(b+" ");
		}
		s.close();
	}

}
