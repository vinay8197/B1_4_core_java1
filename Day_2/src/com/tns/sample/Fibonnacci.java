package com.tns.sample;
import java .util.Scanner;


public class Fibonnacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.print(n1+","+n2);
		for(int i=3;i<=n;i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			
			n1=n2;
			n2=n3;
			
			
			
			
		}

	}

}
