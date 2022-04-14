package com.tns.interThreadCommunication;
//without using wait() method and notify()method
class Seller{
		int value=10000;
		synchronized void cost(int value){
		
			System.out.println(this.value<value);
			if(this.value<value)
			{
				System.out.println("Less value");
				try
				{
				}
				catch(Exception e)
				{}
			}
			this.value=this.value-value;
			System.out.println("process completed :"+this.value);
		}
		synchronized void paid(int value){
			System.out.println("get value");
			this.value=this.value+value;
			System.out.println("completed"+this.value);
			
			}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller c=new Seller();
		new Thread(){
				public void run()
				{
					c.cost(150000);
				}
			}.start();
		new Thread(){
			public void run()
			{
				c.paid(10000);
			}
		}.start();
	}
}
	


