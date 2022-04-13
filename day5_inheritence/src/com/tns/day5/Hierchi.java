package com.tns.day5;
class Cell_phone{
	void message() {
		System.out.println("vinay");
		
	}
	void call() {
		System.out.println("call");
	}
	void facelock() {
		System.out.println("Face lock");
	}
}
class One_plus extends Cell_phone{
	void camera() {
		System.out.println("camera ");
	}
}
class Mi extends Cell_phone{
	void game() {
		System.out.println("multiple games");
	}
}

public class Hierchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One_plus a=new One_plus();
		a.message();
		a.camera();
		Mi b=new Mi();
		b.message();
		b.game();

	}

}
