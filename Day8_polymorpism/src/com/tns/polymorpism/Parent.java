package com.tns.polymorpism;
class base{
	void method1() {
		System.out.println("Base method1");
	}

	
}
class child extends base{
	void method1() {
		System.out.println("child method1");
	}

	
}

public class Parent {
	void method1() {
		System.out.println("Parent method1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base b=new child();
		b.method1();
		child c=new child();
		c.method1();

	}

}
