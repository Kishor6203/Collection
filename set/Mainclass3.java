package com.set;

import java.util.ArrayList;

public class Mainclass3 {
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee(1011, "Bheem",35000.00);
		Employee e2=new Employee(1102, "Chutki",25000.00);
		Employee e3=new Employee(2065, "Raju",30000.00);
		Employee e4=new Employee(1001, "Indumati",27000.00);
		Employee e5=new Employee(2150, "Jaggu",15000.00);
		Employee e6=new Employee(1102, "Kalia",45000.00);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		System.out.println("-------------------------");
		System.out.println("ID\tName\tSalary");
		System.out.println("-------------------------");
		for(Employee emp : empList) {
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.Salary);
		}
	}
}
