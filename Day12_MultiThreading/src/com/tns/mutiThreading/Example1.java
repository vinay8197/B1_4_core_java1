package com.tns.mutiThreading;
//new child thread creation by using  extending Thread class
class Test extends Thread

{

	public void run()

		{

			System.out.println("thread is running...");
			System.out.println("child thread Executend in run method "+Thread.currentThread());
			System.out.println("child thread name "+Thread.currentThread().getName());
			System.out.println("Child thread Id"+Thread.currentThread().getId());
			System.out.println("child Thread Group"+Thread.currentThread().getThreadGroup());
			System.out.println("child thread maxpriority"+Thread.currentThread().getThreadGroup().getMaxPriority());
			System.out.println("child thread parent namr:"+Thread.currentThread().getThreadGroup().getParent());

		}

}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.start();
		System.out.println("Executed in main method "+Thread.currentThread());
		

	}

}
