package com.tns.LinkedList1;
//Program to print the size of the LinkedList by using size()method
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("JAVA");
		list.add("Language");
		list.add("C");
		list.add("C++");
		list.add("Language");
		System.out.println(list);
		System.out.println("The size of the LinkedList is :"+list.size());
		}
}
