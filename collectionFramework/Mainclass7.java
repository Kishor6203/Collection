package com.collectionFramework;

import java.util.ArrayList;
public class Mainclass7 {
	public static void main(String[] args) {
		ArrayList a1;
		ArrayList a11;
		
		a1=new ArrayList();
		a11=new ArrayList();
		
		boolean res=a1.isEmpty();
		System.out.println(res);
		a1.add(200);
		a1.add("string");
		a1.add(20.2);
		a1.add(654823592123L);
		a1.add('c');
		a11.add(200);
		a11.add("string");
		a11.add(20.8);
		a11.add(1236594857L);
		a11.add('c');
		
		System.out.println(a1);
		System.out.println(a11);
		
		//Object ele=a1.set(0,100);
		//System.out.println(ele);
	}
}
