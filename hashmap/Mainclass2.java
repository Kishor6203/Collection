package com.hashmap;

import java.util.HashMap;

public class Mainclass2 {
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
		Object val = hm1.get(10);
		System.out.println(val);
		boolean res1=hm1.containsKey("demo");
		System.out.println(res1);
		boolean res2=hm1.containsValue(100);
		System.out.println(res2);
	}
}
