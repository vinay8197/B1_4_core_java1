package com.tns.vector;
import java.util.Vector;

public class Example2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(0, 1);
		v.add(1, 2);
		v.add(2, "Technical");
		v.add(3, "Technology");
		v.add(4, 3);
		v.add(10);
		System.out.println(v);
	}
}
