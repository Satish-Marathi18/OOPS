package com;

//Accessing public members in different class, but in same package
public class EmployeeMainClass {
	public static void main(String[] args) {
		System.out.println("Id: "+Employee.id);

		Employee emp = new Employee();
		System.out.println("Name: "+emp.name);
		System.out.println("Salary: "+emp.sal);
	}
}
