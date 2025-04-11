package com.queue;

import java.util.LinkedList;

public class Mainclass4 {
	public static <integer> void main(String[] args) {
		System.out.println("===============================");
		 LinkedList<Integer> intList = new LinkedList<>();
	   
	        intList.add(100);
	        intList.add(200);
	        intList.add(300);
	        intList.add(400);
	        intList.add(500);
	        
	        System.out.println("list element");
	        System.out.println(intList);
	        
	        System.out.println("first element: "+intList.getFirst());
	        System.out.println("last element: "+intList.getLast());
	        System.out.println("add element at first");
	        
	        intList.add(50);
	        System.out.println("list element");
	        System.out.println(intList);
	        System.out.println("add element at last");
	        
	        intList.add(550);
	        System.out.println("list element");
	        System.out.println(intList);
	        System.out.println("remove first element");
	        
	        intList.removeFirst();
	        System.out.println("list element");
	        System.out.println(intList);
	        System.out.println("remove last element");
	        
	        intList.removeLast();
	        System.out.println("list element");
	        System.out.println(intList);
	        System.out.println("====================================");
	}
}
