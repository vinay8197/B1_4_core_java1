package com.tns.Collection_operation;
//Program to replace the element by using set() method by passing two arguments first argument is index if ArrayList Second Argument is Replace element
import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2654);
		list.add(362);
		list.add(247);
		list.add(326);
		System.out.println("before set method: "+list);
		list.set(1, 000);
		list.set(3, 111);
		System.out.println("After set method  "+list);
	}
}
