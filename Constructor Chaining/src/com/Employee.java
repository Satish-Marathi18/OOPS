package com;

public class Employee {

	Employee(int age){
		this(3.6);
		System.out.println("Age:"+age);
	}
	
	Employee(int id, String name){
		System.out.println("Id:"+id +"  "+"Name:"+name);
	}
	
	Employee(double sal){
		this(100,"Tom");
		System.out.println("Salary:"+sal);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(23);
	}
}
