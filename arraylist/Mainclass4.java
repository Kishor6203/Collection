package com.arraylist;

import java.util.ArrayList;

public class Mainclass4 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		ArrayList<String>strlist=new ArrayList<String>();
		strlist.add("Bheem");
		strlist.add("Chutki");
		strlist.add("Kalia");
		strlist.add("Jaggu");
		strlist.add("Indu");
		strlist.add("Raju");
		strlist.add("Dolu");
		strlist.add("Bolu");
		System.out.println("=========================");
		System.out.println("String\tTotal Character");
		System.out.println("=========================");
		for(String element : strlist) {
			System.out.println(element+"\t"+element.length());
		}
		System.out.println("Main method ends");
	}

}
