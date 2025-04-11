package com.arraylist;

import java.util.ArrayList;

class pen{
	String brand = "gell";
	String color = "blue";
	double price = 25.0;
	public String toString() {
		return"{"+brand+","+color+","+price+"}";
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("total element"+ al.size());
		al.add(100);           //auto boxing & upcasting
		al.add(12.5);          //auto boxing & upcasting
		al.add("test");        //upcasting
		al.add(new pen());     
		al.add(null);
		System.out.println("total element"+al.size());
		String str = (String)al.get(2);
		System.out.println(str.toUpperCase());
	}

}
