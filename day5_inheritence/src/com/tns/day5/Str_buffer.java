package com.tns.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Str_buffer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String name=bf.readLine();
		 System.out.println("The input string is :"+name);

	}

}
