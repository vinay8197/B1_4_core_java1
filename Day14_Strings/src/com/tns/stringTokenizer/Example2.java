package com.tns.stringTokenizer;
import java.util.StringTokenizer;

public class Example2 {
	public static void main(String args[]){
			StringTokenizer st = new StringTokenizer("Letstry this");
			while(st.hasMoreTokens())//it check whether the next strings are present or not by using hasMoreToken() method
			{
				System.out.println(st.nextToken());
			}
			}

}
