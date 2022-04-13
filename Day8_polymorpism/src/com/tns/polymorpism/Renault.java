package com.tns.polymorpism;

public class Renault {
	String color;
	int speed;
	Renault(){
		System.out.println("I bought Renalut in 2020");
	}
	Renault(String color,int speed){
		this.color=color;
		this.speed=speed;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renault a=new Renault();
		Renault b=new Renault("yellow",150);
		System.out.println("color :"+b.color+"   speed :"+b.speed);
		
		
       
	}

}
