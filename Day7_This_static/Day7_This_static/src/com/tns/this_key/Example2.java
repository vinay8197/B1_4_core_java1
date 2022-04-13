package com.tns.this_key;

public class Example2 {
	int a,b;
	void dispaly(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void print() {
		System.out.println("The value is:"+a);
		System.out.println("The value is:"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 a=new Example2();
		a.dispaly(1,2);
		a.print();

	}

}
