package com.collectionFramework;

import java.util.ArrayList;

public class Mainclass1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(13);
		al.add("ABC");
		al.add('A');
		al.add(true);
		al.add(50);
		System.out.println(al);
		for(Object obj : al)
		{
			if(obj instanceof Boolean) {
				System.out.println(obj);
			}
		}
	}
}
