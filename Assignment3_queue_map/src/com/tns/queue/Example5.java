package com.tns.queue;
import java.util.*;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();

		queue.offer("one");

		queue.offer("two");

		System.out.println(queue);

		System.out.println(queue.poll());

		System.out.println(queue.poll());

		System.out.println(queue.poll());

	}

}
