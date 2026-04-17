package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> s = new HashSet<Employee>();

		Employee e1 =(new Employee(1, "Rohit"));
		Employee e2 = (new Employee(1, "Rohit   ")); 
		Employee e3=e2;
		Employee e4 = new Employee(1,"java");
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);

		System.out.println("is e1 equal to s2 " +(e1.equals(e2)));
		//System.out.println("is e1 equal to s2 " +(e1.equals(e2)));
		System.out.println("is e3 equal to s2 " +(e3.equals(e2)));
		
		System.out.println(" e1 hashcode " +e1.hashcode(e2));
	}

}
class Employee{
	Integer emp_id;
	String emp_name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String hashcode(Employee e2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee(Integer emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}

	@Override
	public int hashCode() {
		return emp_id + 1; 
	} 

	@Override
	public boolean equals(Object obj) {
		
		// check for the specific instance of the class
		// check whether the id is existing with any other object
		if (obj instanceof Employee && ((Employee) obj).emp_id == this.emp_id) {
		    return true;
		}
		else {
			return false;
		}
		
	}
	
	
}



