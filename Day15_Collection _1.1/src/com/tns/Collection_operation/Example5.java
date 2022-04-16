package com.tns.Collection_operation;
//To check the given element is present in the given ArrayList or not by using contains() method

import java.util.ArrayList;

public class Example5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(145);
		list.add(135);
		list.add(2453);
		list.add(123);
		System.out.println("The element is present in the given ArrayList is :"+list.contains(123));	
	}
}
