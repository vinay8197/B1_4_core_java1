package com.tns.abst;
class A{
	String name="Vinay";
}
class B extends A{
	String name="Naveen";
	void print() {
		System.out.println("This without super key word:"+ name);
		System.out.print("This with super key word:"+super.name);
		
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B();
		a.print();

	}

}
