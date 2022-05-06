package com.tns.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Example5 {
	private static String regex="Nashik";
	private static String str="I love Nashik "+"Nashik is famous for oranges ";
	private static String replace="Amravati";
	public static void main(String[] args) {
		try
		{
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(str);
			str=m.replaceAll(replace);
			System.out.println(str);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Patter Syntax Exception: "+e.getDescription());
			System.out.println("Index: "+e.getIndex());
			System.out.println("Message: "+e.getMessage());
			
		}

}

}
