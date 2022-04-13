package com.tns.oop;

public class Car {
	String str;
	Car(String s){
		str=s;
	}
	void print() {
		System.out.println("This is :"+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a=new Car("Audi");
		Car b=new Car("BMW");
		Car c=new Car("Benze");
		a.print();
		b.print();
		c.print();

	}

}
