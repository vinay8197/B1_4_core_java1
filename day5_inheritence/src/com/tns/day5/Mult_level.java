package com.tns.day5;
class R6{
	public void assign() {
		System.out.print("I love R6");
	}
}
class R3 extends R6{
	public void display() {
		System.out.print("I love R3");
	}
	
	
}
class R15 extends R3{
	public void print() {
		System.out.print("I love R15");
	}
}

public class Mult_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R15 a=new R15();
		a.print();
		a.display();
		a.assign();

	}

}
