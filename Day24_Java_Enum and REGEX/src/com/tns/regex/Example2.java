package com.tns.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("I");
		Matcher m=p.matcher("I lives in Mumbai and Its famous for bollywood city");
		while(m.find())
		{
			System.out.println("Pattern found from" +m.start()+ " to "+ (m.end()-1));
		}

	}

}
