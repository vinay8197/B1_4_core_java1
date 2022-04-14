package com.tns.interrupt1;
class Thread4 extends Thread{
	public void run()
	
	{
		System.out.println("check interrupted method in run method is: "+this.interrupted());//iteruption checking in run method
			for(int i=1;i<=3;i++)
			{
				System.out.println("doing task "+i);
			}
	}
}
public class Assignment {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("main thread inturupted :"+Thread.interrupted());
			Thread4 t1=new Thread4();
			
			t1.start();
			Thread.currentThread().interrupt();
			System.out.println("main thread after interrupt :"+Thread.interrupted());
			
			System.out.println("is child thread interrupted"+t1.isInterrupted());//checking whether the thread is interrupt of not and return boolean value
		
			t1.interrupt();//it interrupt the t1 thread 
			System.out.println("is child thread interrupted "+t1.isInterrupted());
		}
}
