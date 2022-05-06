package com.tns.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example1 {
	public static void main(String[] args) {
		String pattern="vinay vinu";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		boolean Result=Pattern.matches(pattern, input);
		System.out.println(Result);
		s.close();
	}

}
