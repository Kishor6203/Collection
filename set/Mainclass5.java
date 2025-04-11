package com.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Mainclass5 {
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee(1011, "Kishor",35000.00);
		Employee e2=new Employee(1102, "Abhi",25000.00);
		Employee e3=new Employee(2065, "Abhinav",30000.00);
		Employee e4=new Employee(1001, "Manisha",27000.00);
		Employee e5=new Employee(2150, "Puja",15000.00);
		Employee e6=new Employee(1102, "Susmita",45000.00);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e2);
		empList.add(e6);
		
		System.out.println("-----------------------");
		System.out.println("Unsorted employee list");
		System.out.println("-----------------------");
		System.out.println("Id\tname\tsalary");
		for(Employee emp : empList) {
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.Salary);
		}
		TreeSet<Employee> empSet=new TreeSet<Employee>(empList);
		System.out.println("-----------------------");
		System.out.println("Sorted employee list");
		System.out.println("-----------------------");
		System.out.println("Id\tname\tsalary");
		for(Employee emp : empList) {
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.Salary);
		}
	}
}
