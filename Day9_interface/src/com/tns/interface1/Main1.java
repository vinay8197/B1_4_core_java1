package com.tns.interface1;
interface example1 {
	
       void display();
       void print();

}


public class Main1 implements example1{
	public void display() {
		System.out.println("Hi friends");
	}
      public void print() {
		System.out.println("Hi students");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 a=new Main1();
		a.display();
		a.print();

	}

}
