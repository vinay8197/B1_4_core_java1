package com.tns.lamda;

interface A
{
	void show();
}
/*class Xyz implements A
{
	public void show()
	{
		System.out.println("Welcome to Lambda Expression");
	}
}*/
public class Lamda1 {

	public static void main(String[] args) 
	{
		A obj=()->
		{
			System.out.println("Welcome to Lambda Expression");

		};
		obj.show();
	}
}