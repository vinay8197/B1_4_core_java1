package com.tns.stringBuffer;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff = new StringBuffer("Internet of things");//default size 16+18=34
		System.out.println(buff.capacity());
		buff = new StringBuffer("a");//16+1=17
		System.out.println(buff.capacity());
	}

}
