package com.tns.mutiThreading;
import java.lang.Runnable;
//

//creating a child thread by implementing Runnable interface

class Test1 implements Runnable

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



public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 r=new Test1();
		Thread t=new Thread(r);
		t.start();
		System.out.println("main method execution "+Thread.currentThread());
		

	}

}
