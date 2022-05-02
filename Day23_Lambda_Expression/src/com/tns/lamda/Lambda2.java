package com.tns.lamda;

interface A1
{
	void show(int i);
}



public class Lambda2 {

	
		

			public static void main(String[] args) 
			{
				//Lambda Expression
				A1 obj=(int i)->
				{
					System.out.println("Welcome to Lambda Expression "+i);

				};
				obj.show(5);
			}
		}