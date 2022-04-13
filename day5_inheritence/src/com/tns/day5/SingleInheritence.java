package com.tns.day5;

class Parent1{
	 public void print()
	{
		System.out.print("Hello,this is Vinay");
	
	}
}
	
class Child1 extends Parent1
	{
		public void display()
		{
			System.out.print("single_inheritence");
		}
	}
public class SingleInheritence
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Child1 c=new Child1();
			c.display();
			c.print();
		
		
		
		}
}
