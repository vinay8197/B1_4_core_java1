package com.tns.dequeue;
import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;

		Queue<Integer>queue=new ArrayDeque<Integer>();

		for(i=10;i<15;i++)

		{

		queue.add(i);

		}

		System.out.println(queue);

		((Deque<Integer>) queue).addLast(20);

		System.out.println("deque:" +queue);

		boolean isAdded = ((ArrayDeque<Integer>) queue).offerLast(30);

		System.out.println("isAdded:" +isAdded);

		Iterator<Integer> itr = queue.iterator();

		System.out.println("Iterating elements");
		while(itr.hasNext())

		{

		System.out.println(itr.next());

		}

	}

}
