package com.tns.generics;

public class GenericMethod {
	public static<E> void print(E[] elements) {
		for(E itr:elements) {
			System.out.println(itr);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]a= {11,12,13};
		Character[] c= {'a','b','c'};
		print(a);
		print(c);
		

	}

}
