package com.set;

import java.util.TreeSet;

public class Mainclass1 {
	public static void main(String[] args) {
		TreeSet<Employee> empSet=new TreeSet<Employee>();
		Employee e1=new Employee(1011, "Bheem",35000.00);
		Employee e2=new Employee(1102, "Chutki",25000.00);
		Employee e3=new Employee(2065, "Raju",30000.00);
		Employee e4=new Employee(1001, "Indumati",27000.00);
		Employee e5=new Employee(2150, "Jaggu",15000.00);
		Employee e6=new Employee(1102, "Kalia",45000.00);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.add(e6);
		
		for(Employee emp : empSet) {
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.Salary);
		}
	}

}
