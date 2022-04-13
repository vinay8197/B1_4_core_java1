package com.tns.static1;

public class Exaample3 {
	static int a=1;
	static String s="Hello";
	static {
		a=20;
		s="hi";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exaample3 b=new Exaample3();
		System.out.println(a);
		System.out.println(s);
		

	}

}

