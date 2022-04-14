package com.tns.mutiThreading;
class Test4 extends Thread

{

		public void run()

			{

				System.out.println(" thread passed ");

			}

}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t=new Test4();
		t.start();
	//	t.start();//multiple call of the start method by using same object is not possible
		

	}

}
