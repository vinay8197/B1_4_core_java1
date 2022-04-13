package com.tns.abst;
class Person1{
	
	Person1(){
		System.out.println("person constructor");
		
	}
}
class Student1 extends Person1{
	Student1() {
		super();
		System.out.println("Student constructor");
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 a=new Student1();

	}

}
