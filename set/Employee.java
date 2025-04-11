package com.set;

public class Employee implements Comparable<Employee> {
	Integer id;
	String name;
	Double Salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.Salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		if(this.id >e.id) {
			return 1;
		}
		else if(this.id<e.id) {
			return -1;
		}
		else {
			return 0;
		}
		//another way to print
		   //return this.id.compareTo(e.id);//assending
		   //return -1*this.id.compareTo(e.id);//dessending
	}
}
