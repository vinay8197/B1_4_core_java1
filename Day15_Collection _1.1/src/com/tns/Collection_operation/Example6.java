package com.tns.Collection_operation;
//program to get the index of ArrayList by passing the input as Argument for indexOf()Method

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("JAVA");
		list.add("SERVLETS");
		list.add("JAVA");
		list.add("STRUTS");
		System.out.println(list);
		System.out.println("First index is :"+list.indexOf("JAVA"));
		System.out.println("Last index is :"+list.lastIndexOf("JAVA"));
		}
}


