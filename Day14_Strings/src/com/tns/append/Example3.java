package com.tns.append;

public class Example3 {
	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("Try");
			System.out.println(sb);
			sb.setCharAt(3,'x');//it shows error because their is no presence of third index in the sb string
			System.out.println(sb);
		}
}
