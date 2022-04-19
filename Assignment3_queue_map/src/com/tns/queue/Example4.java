package com.tns.queue;
import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>queue=new PriorityQueue<Integer>();

		queue.offer(4);

		queue.offer(8);

		queue.add(12);

		queue.add(16);

		queue.add(20);

		System.out.println(queue);
		System.out.println("The head is " +queue.peek());

	}

}
