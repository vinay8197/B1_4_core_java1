package com.tns.interrupt1;
class Thread2 extends Thread{
		public void run(){
			try{
				Thread.sleep(10000000);
				System.out.println("work");
				}
			catch(InterruptedException e){
				System.out.println("Exception handled "+e);
				}
			System.out.println("thread is running");
		}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1=new Thread2();
		t1.start();
		t1.interrupt();//it interupt the sleeping thread
		}
}
