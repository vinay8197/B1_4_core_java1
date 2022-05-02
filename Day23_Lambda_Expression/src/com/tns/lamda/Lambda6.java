package com.tns.lamda;

interface D
{
	int mul(int x,int y);
}
public class Lambda6 {

	public static void main(String[] args) {
		//Lambda Expression without return 
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(20, 30));

	}

}