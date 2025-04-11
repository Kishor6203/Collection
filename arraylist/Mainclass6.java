package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Mainclass6 {
	public static void main(String[] args) {
		System.out.println("main method started");
		ArrayList<Integer>intList=new ArrayList();
		intList.add(101);
		intList.add(102);
		intList.add(103);
		intList.add(104);
		intList.add(105);
		intList.add(106);
		intList.add(107);
		intList.add(108);
		intList.add(109);
		intList.add(110);
		System.out.println("total element: "+intList.size());
		System.out.println("element are: ");
		System.out.println(intList);
		System.out.println("adding 11th element");
		intList.add(111);
		System.out.println("element are: ");
		System.out.println(intList);
		System.out.println("main method ended");
	}

}
