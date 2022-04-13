package com.tns.this_key;
class Main{
	int a;
	Main(){
		this(10);
		System.out.println("Delfault constructor");
		
	}
	Main(int b){
		a=b;
		System.out.println("Inside parametrizwd constructor ");
	}
	
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main s=new Main();
		

	}

}
