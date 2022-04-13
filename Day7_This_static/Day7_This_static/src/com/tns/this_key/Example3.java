package com.tns.this_key;

public class Example3 {
	void print(Example3 e) {
		System.out.println("Java developer");
	}
	void display() {
		print(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 a=new Example3();
		a.display();

	}

}
