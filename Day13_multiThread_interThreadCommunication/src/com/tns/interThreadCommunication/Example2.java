package com.tns.interThreadCommunication;
//with using wait method only
class Seller1{
		int value=10000;
		synchronized void cost(int value){
		
			System.out.println(this.value<value);
			if(this.value<value)
			{
				System.out.println("Less value");
				try
				{
					wait();
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

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller1 c=new Seller1();
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
	



