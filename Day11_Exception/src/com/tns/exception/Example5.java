package com.tns.exception;

public class Example5 {


		public static void main(String args[]){

		try{

		int data = 30/3;

		System.out.println(data);

		}

		catch(NullPointerException e)

		{

		System.out.println(e);

		}

		finally

		{

		System.out.println("finally block is always executed");
		

		}

		}

		}


