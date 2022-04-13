package com.tns.this_key;

public class Example4 {
	String str;
	Example4(){
		str="vinay";
		
	}
	Example4 get() {
		return this;
	}
	void display() {
		System.out.println("This is:"+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 a=new Example4();
		a.display();
		System.out.println(a.get());
		a.get().display();

	}

}
