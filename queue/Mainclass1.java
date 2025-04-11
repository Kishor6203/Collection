package com.queue;

import java.util.PriorityQueue;

public class Mainclass1 {
	public static void main(String[] args) {
		PriorityQueue q1=new PriorityQueue();
		System.out.println("Priority queue element");
		System.out.println(q1);
		System.out.println("total element in queue: "+q1.size());
		System.out.println("is queue empty ?"+q1.isEmpty());
		
		q1.add(100);
		q1.add(54);
		q1.add(150);
		q1.add(10);
		q1.add(35);
		q1.add(5);
		
		System.out.println("Priority queue element");
		System.out.println(q1);
		System.out.println("total element in queue: "+q1.size());
		System.out.println("is queue empty ?"+q1.isEmpty());
		
		q1.remove();
		System.out.println("Priority queue element");
		System.out.println(q1);
		System.out.println("total element in queue: "+q1.size());
		System.out.println("is queue empty ?"+q1.isEmpty());
		
		q1.remove();
		System.out.println("Priority queue element");
		System.out.println(q1);
		System.out.println("total element in queue: "+q1.size());
		System.out.println("is queue empty ?"+q1.isEmpty());
	}
}
