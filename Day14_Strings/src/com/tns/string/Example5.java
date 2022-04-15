package com.tns.string;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=new String(s.nextLine());
		System.out.println("Length of the string is "+s1.length());
		System.out.println("covert to upper case letter :"+s1.toUpperCase());
		System.out.println("first  Charecter of the string is: "+s1.charAt(0));
		System.out.println(10+20+"Hellow"+"world"+10+90);
		System.out.println("vinay".concat("vinu"));

	}

}
