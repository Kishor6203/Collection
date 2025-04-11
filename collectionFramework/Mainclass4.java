package com.collectionFramework;

import java.util.ArrayList;

public class Mainclass4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		int element=al.size();
		System.out.println("Size of ArrayList is:"+element);
		boolean res=al.isEmpty();
		System.out.println("ArrayList is empty:"+res);
		System.out.println("ArrayElements is");
		System.out.println(al);
		al.add(100);
		al.add("test");
		al.add(5.5);
		al.add(100);
		al.add('p');
		al.add(null);
		System.out.println(al);
		element=al.size();
		System.out.println(element);
		boolean res1=al.isEmpty();
		System.out.println("ArrayList Element is empty:"+res1);
		int index=al.indexOf(100);
		System.out.println(index);
		al.remove("test");
		System.out.println(al);
		boolean contain=al.contains(100);
		System.out.println("Exixts ArrayList:"+contain);
		al.add(1,125);
		System.out.println(al);
		al.set(3, "Demo");
		element=al.size();
		System.out.println(element);
		Object elements=al.get(3);
		System.out.println(elements);
		System.out.println(al);
	}

}
