package com.hashmap;

import java.util.HashMap;

public class Mainclass1 {
	public static void main(String[] args) {
		System.out.println("main methods stsrted");
		HashMap hm1=new HashMap(); //empty hashmap object is created
		System.out.println("is empty ?"+hm1.isEmpty());
		System.out.println("total element: "+hm1.size());
		
		hm1.put(10, "test");
		hm1.put(2.5, 100);
		hm1.put("demo", true);
		hm1.put('a', 5.6);
		hm1.put(false, 't');
		hm1.put(10, 265.35);
		
		System.out.println("is empty ?"+hm1.isEmpty());
		System.out.println("total element: "+hm1.size());
		System.out.println("map element");
		System.out.println(hm1);
		System.out.println("main methos ended");
	}
}
