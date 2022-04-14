package com.tns.interrupt1;
class Thread3 extends Thread{
	public void run(){
			for(int i=1;i<=5;i++)
				System.out.println(i);
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t1=new Thread3();
		t1.start();
		t1.interrupt();//The thread is not sleeping  in the run method so it run normal
		}
}
