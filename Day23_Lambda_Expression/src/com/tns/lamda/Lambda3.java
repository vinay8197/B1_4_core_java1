package com.tns.lamda;

interface B
{
	abstract public void display(int a,int b);
}
public class Lambda3 {

	public static void main(String[] args) {
		B obj1=(int a,int b)->
		{
			System.out.println("Addition of a and b is: "+(a+b));
		};
		obj1.display(12, 13);

	}

}