package com.set;

import java.util.Comparator;
import java.util.TreeSet;

class IdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return e1.id.CompareTo(e2.id);
	}
	
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.Salary.compareTo(e2.Salary);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}
public class Mainclass2 {
	public static void main(String[] args) {
		IdComparator idwise=new IdComparator();
		SalaryComparator salarywise=new SalaryComparator();
		NameComparator namewise=new NameComparator();
		
		//TreeSet<Employee> empSet=new TreeSet<Employee>(namewise);
		TreeSet<Employee> empSet=new TreeSet<Employee>(salarywise);
		//TreeSet<Employee> empSet=new TreeSet<Employee>(idwise);
		
		Employee e1=new Employee(1011, "Kishor",35000.00);
		Employee e2=new Employee(1102, "Abhi",25000.00);
		Employee e3=new Employee(2065, "Abhinav",30000.00);
		Employee e4=new Employee(1001, "Manisha",27000.00);
		Employee e5=new Employee(2150, "Puja",15000.00);
		Employee e6=new Employee(1102, "Susmita",45000.00);
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e2);
		empSet.add(e6);
		
		for(Employee emp : empSet) {
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.Salary);
		}
	}

}
