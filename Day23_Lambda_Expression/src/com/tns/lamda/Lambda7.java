package com.tns.lamda;

public class Lambda7
{

	public static void main(String[] args) 
	{
		//thread example without Lambda Expression
		
		/*Runnable R1=new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("Class Name is: Lambda7");
			}
			
		};
		Thread t=new Thread(R1);
		t.start();*/
		
		
		//thread example using Lambda Expression
		
		Runnable r1=()->
		{
			System.out.println("Class Name is: Lambda7");
		};
		Thread t=new Thread(r1);
		t.start();
	}
}
