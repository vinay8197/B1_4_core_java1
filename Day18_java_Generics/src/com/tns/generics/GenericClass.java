package com.tns.generics;

public class GenericClass<T>{
	T val;
	void print() {
		
		System.out.println(val.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> obj=new GenericClass<>();
		obj.val=10;
		obj.print();

	}

}
