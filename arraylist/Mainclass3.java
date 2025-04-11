package com.arraylist;

import java.util.ArrayList;

public class Mainclass3 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("test");
		al.add(5.6);
		al.add("demo");
		al.add(true);
		al.add("sample");
		String finalString=" ";
		for(Object elements : al) {
			if(elements instanceof String) {
				String str=(String)elements;
				finalString = finalString + str.toUpperCase();
			}
		}
		System.out.println("Concatenated String Is");
		System.out.println(finalString);
		System.out.println("Main method ends");
	}

}
