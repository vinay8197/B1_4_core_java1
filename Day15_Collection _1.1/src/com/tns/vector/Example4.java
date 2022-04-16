package com.tns.vector;
//PRogram to check the contents of the two Vectors by using equals() method
import java.util.Vector;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add("Animal");
		v.add("Flower");
		v.add(4);
		Vector v_2nd = new Vector();
		v_2nd.add(1);
		v_2nd.add(2);
		v_2nd.add("Animal");
		v_2nd.add("Flower");
		v_2nd.add(4);
		if (v.equals(v_2nd))
			System.out.println("both vectors are equal");
		else
			System.out.println("both vectors are not equal");
	}

}
