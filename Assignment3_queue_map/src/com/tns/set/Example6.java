package com.tns.set;
import  java.util.LinkedHashSet;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<String>();

				set.add("Good");

				set.add("For");

				set.add("Health");

				System.out.println(set);

				Object[] arr = set.toArray();

				for (int j = 0; j < arr.length; j++)

				System.out.println(arr[j]);

	}

}
