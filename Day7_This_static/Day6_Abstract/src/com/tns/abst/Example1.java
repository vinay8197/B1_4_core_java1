package com.tns.abst;

abstract class Animal{
	abstract void eat();
}

class Herbivores extends Animal{
	void eat() {
		System.out.println("I am vegiterian");
	}
}
class Carnivores extends Animal{
	void eat() {
		System.out.println("I am Non-vegiterian");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Herbivores a=new Herbivores();
		Carnivores b=new Carnivores();
		
		a.eat();
		b.eat();

	}

}
