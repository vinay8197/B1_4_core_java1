package com.tns.abst;
class Person{
	
	void information(){
		System.out.println("person method");
		
	}
}
class Student extends Person{
	void information() {
		System.out.println("Student method");
	}
	void display() {
		information();
		super.information();
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student();
		a.display();

	}

}
