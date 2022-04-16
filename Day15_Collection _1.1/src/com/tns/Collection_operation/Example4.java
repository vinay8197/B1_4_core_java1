package com.tns.Collection_operation;
//To find the number elements present in the given ArrayList

import java.util.ArrayList;

public class Example4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(2.2);
		list.add(3.3);
		list.add(4.4);
		list.add(5.5);
		System.out.println(list);
		System.out.println("The number of elements present in the given ArrayList is :"+list.size());
	}
}
