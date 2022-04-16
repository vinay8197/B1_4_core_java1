package com.tns.LinkedList1;
//program to display the list in  descending order based on our Requirement
import java.util.LinkedList;
import java.util.Iterator;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Jio");
		list.add("Airtel");
		list.add("BSNL");
		list.add("Vodafone");
		System.out.println(list);
		Iterator<String> dc =list.descendingIterator();
		while (dc.hasNext())
		{
			System.out.println(dc.next());
			
		}
	

    }

}
