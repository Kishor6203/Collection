package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Mainclass4 {
	public static void main(String[] args) {
		
		System.out.println("main method started");
		Employee e1=new Employee(1011, "Bheem",35000.00);
		Employee e2=new Employee(1102, "Chutki",25000.00);
		Employee e3=new Employee(2065, "Raju",30000.00);
		Employee e4=new Employee(1001, "Indumati",27000.00);
		Employee e5=new Employee(2150, "Jaggu",15000.00);
		//store 5 employee details in hashmap
		
		HashMap<Integer,Employee>m1=new HashMap<Integer,Employee>();
		
		m1.put(e1.id, e1);
		m1.put(e2.id, e2);
		m1.put(e3.id, e3);
		m1.put(e4.id, e4);
		m1.put(e5.id, e5);
		
		System.out.println("enter a employee id");
		int id=new Scanner(System.in).nextInt();
		if(m1.containsKey(id)) {
		System.out.println("Employee found details are");
		Employee e=m1.get(id);
		System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
	}
		else {
			System.out.println("Employee not found");
		}
		System.out.println("main method ended");
	}

}
