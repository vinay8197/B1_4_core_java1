package com.tns.stringTokenizer;
import java.util.StringTokenizer;

public class Example3 {
	public static void main(String args[])
     {
		StringTokenizer st3 =new StringTokenizer("JAVA:Code:String",":",true);
	while (st3.hasMoreTokens())
			System.out.println(st3.nextToken());

	}

}
