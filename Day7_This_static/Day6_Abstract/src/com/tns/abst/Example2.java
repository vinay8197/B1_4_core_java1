package com.tns.abst;

class Example{
	//Final methods we con't over ride
	final void display() {
		System.out.println("hi");
		
	}
}

public class Example2 extends Example{
	final int a=100;//we con't change the value of the final variable
	void print() {
		
		System.out.println(a);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 c=new Example2();
		c.display();//final method is inherited
		

	}

}
