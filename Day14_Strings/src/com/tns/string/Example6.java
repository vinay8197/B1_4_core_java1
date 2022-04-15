package com.tns.string;

public class Example6 {
	public static void main(String args[]){

		String s = "Apple";

		String r = null;

		System.out.println(s + r);

		System.out.println(s.concat(r));//it throws Nullpointer Exception
	}

}
