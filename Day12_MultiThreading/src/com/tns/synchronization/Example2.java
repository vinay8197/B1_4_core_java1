package com.tns.synchronization;
class Test
{
	synchronized void printTable(int n)//synchronized method
		{		for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);

				try
				{
					Thread.sleep(400);
				}	
				catch(Exception e)
				{
						System.out.println(e);
				}
			}
		}
}
class Thread1 extends Thread{
		Test t;
		Thread1(Test t)
		{
			this.t=t;
		}
		public void run()
		{	
			t.printTable(5);
		}
}
class Thread2 extends Thread{
		Test t;
		Thread2(Test t){
			this.t=t;
			}

		public void run(){
				t.printTable(100);
				}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();//only one object
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);//multiple thread is operating on the single object but the synchronize method  allow one thread at a time
		t1.start();
		t2.start();
		}
}
