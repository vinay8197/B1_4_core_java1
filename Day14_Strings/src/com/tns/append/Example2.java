package com.tns.append;

public class Example2 {
	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("Jeva");
			System.out.println(sb);
			System.out.println(sb.charAt(1));
			sb.setCharAt(1, 'a');//changing the character by using set method
			System.out.println(sb);
			System.out.println(sb.charAt(1));
			}
}
