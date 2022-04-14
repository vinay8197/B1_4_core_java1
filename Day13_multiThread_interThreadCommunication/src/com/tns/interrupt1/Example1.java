package com.tns.interrupt1;

class Thread1 extends Thread{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("work");
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException("vinay throws the exception to the jvm Threadinterrupted"+e);
		}
		
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		t1.start();
		try{
			t1.interrupt();
			}
		catch(Exception e){
				System.out.println("Exception handled "+e);
			}
	}
}
