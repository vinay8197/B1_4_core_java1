package com.tns.synchronization;

class Counter{

		int count;

		public synchronized void increment()//allow one Thread at a time

		{

			count++;

		}

}

public class Example1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c=new Counter();

		Thread t1 =new Thread (new Runnable()

		{

			public void run(){

				for(int i=1;i<=1000;i++)

				{

					c.increment();

				}

		}

		});


		Thread t2 =new Thread (new Runnable()

		{

			public void run()

		{

				for(int i=1;i<=1000;i++)

				{

					c.increment();

				}

		}

		});

		t1.start();

		t2.start();

		t1.join();//join method is used the current thread is wait untill completion of the t1 object job

		t2.join();//current thread is wait untill completion of t2 object job

		System.out.println(c.count);

	}

}
