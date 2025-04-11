package com.collectionFramework;

import java.util.ArrayList;

public class Mainclass5 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(659);
		al.add("String");
		al.add(12.5);
		al.add(null);
		al.add(659);
		al.add("test");
		int totalelement=al.size();
		System.out.println("Total elements in ArrayList:"+totalelement);
		boolean result=al.isEmpty();
		System.out.println("in ArrayList element is empty:"+result);
		al.remove("test");
		boolean res=al.contains(659);
		System.out.println(res);
		al.set(1, "Elephant");
		al.add(6,159);
		System.out.println(al);
		Object abs=al.get(1); //reading element @read
		System.out.println(abs);
	}

}
