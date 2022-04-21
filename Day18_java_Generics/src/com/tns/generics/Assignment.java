package com.tns.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> s=new LinkedList<String>();
		s.add("vinay");
		s.add("varun");
		s.addFirst("sharu");
		s.addLast("varu");
		//s.add(10);type mis match
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
