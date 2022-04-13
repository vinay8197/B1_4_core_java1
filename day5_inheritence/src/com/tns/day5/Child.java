package com.tns.day5;


class Parent{
     String s="Vinay";
     public void display() {
    	 System.out.println("This is :"+s);
     }
	

}



class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		
		

	}

}
