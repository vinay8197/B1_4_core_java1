package com.tns.mutiThreading;

public class Main {
	public static void main(String args[])

	{

	Thread t = Thread.currentThread( );

	System.out.println("Current Thread :" + t);

	t.setName("Vinay");//set the new name to the Thread by using setName() method

	System.out.println("Current thread :" +t);

	try

	{

	Thread.sleep(1);

	}

	catch (InterruptedException e)

	{

	System.out.println("Main ThreadInterrupted");

	}

	}

}
