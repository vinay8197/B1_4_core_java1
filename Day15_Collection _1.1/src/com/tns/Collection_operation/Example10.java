package com.tns.Collection_operation;
//Program to create a separate copy of the ArrayList object by using clone() method
import java.util.ArrayList;

public class Example10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		Object cloneList;
		al.add("Technology");
		al.add("Java");
		al.add("Arrays");
		System.out.println(al);
		cloneList= al.clone();
		System.out.println(cloneList);
		System.out.println("The address of the two object is same :"+(cloneList==al));//to checking whether the two object address is same or not
		System.out.println("The values of the object is same :"+cloneList.equals(al));//To check the content of the two object is same or not
	}
}
