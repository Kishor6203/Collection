package com.arraylist;

import java.util.ArrayList;

public class Mainclass5 {
	public static void main(String[] args) {
		System.out.println("main method started");
		Employee emp1=new Employee(101,"Ramesh",21000.00,1.2);
		Employee emp2=new Employee(102,"Kishor",25000.00,1.5);
		Employee emp3=new Employee(103,"Divya",20000.00,2.0);
		Employee emp4=new Employee(104,"Anamika",10000.00,1.1);
		Employee emp5=new Employee(105,"Arpita",30000.00,2.5);
		
		ArrayList<Employee>empList=new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println("===================================");
		System.out.println("ID\tname\tsalary\texperince");
		System.out.println("===================================");
		for(Employee emp : empList) {
			//emp.displaydetails();
		System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp());
		}
		System.out.println("main method ended");
	}

}
