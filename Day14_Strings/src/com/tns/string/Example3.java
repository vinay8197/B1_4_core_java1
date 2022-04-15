package com.tns.string;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str="Hello";
		String str1="Hello";
		String s1=new String("hi");
		String s2=new String("hi");
		System.out.println(str==str1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(str.equals(str1));

	}

}
