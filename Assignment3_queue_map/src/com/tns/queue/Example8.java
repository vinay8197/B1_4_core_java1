package com.tns.queue;
import java.util.*;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>queue=new PriorityQueue<Integer>();

		System.out.println("The removed element is:"+queue.poll());

		System.out.println("The head element is: "+queue.peek());

	}

}
