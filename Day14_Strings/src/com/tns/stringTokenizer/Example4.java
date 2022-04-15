package com.tns.stringTokenizer;
import  java.util.StringTokenizer;

public class Example4 {
	public static void main(String args[]){

	StringTokenizer st3 =new StringTokenizer("JAVA:Code:String", ":", false);

	while (st3.hasMoreTokens())

	System.out.println(st3.nextToken());

	}

}
