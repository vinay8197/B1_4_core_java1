package com.tns.synchronization;

class Test1{
	public synchronized void display()
	{	System.out.println("Current thread " + Thread .currentThread().getName());
		for(int i = 0; i < 5 ; i++)
		{
				System.out.println(Thread.currentThread().getName() + "  i - " +i);
				try{
					Thread.sleep(50);
					}
				catch (InterruptedException e)
					{
						e.printStackTrace();
					}
		 }
	}
}
class Valueof implements Runnable{
	Thread t;
	Test1 val;
	Valueof(Test1 val)
	{
		this.val = val;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		val.display();
	}
}
public class Main{
	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		Test1 obj2 = new Test1();
		Valueof t1 = new Valueof(obj1);
		Valueof t2 = new Valueof(obj2);//mutiple Thread on multiple object
		}
}
