package com.tns.interface1;
interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
	public void  myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}

public class Multiple_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass myObj=new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
