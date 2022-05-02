package com.tns.lamda;

interface C
{
	String print(String message);
}



public class Lambda5 {

	public static void main(String[] args) {
		//Lambda Expression using return
		C obj=(String message)->
		{
			return message;
			
		};
		System.out.println("The Name is: "+obj.print("Vinay"));

	}

}