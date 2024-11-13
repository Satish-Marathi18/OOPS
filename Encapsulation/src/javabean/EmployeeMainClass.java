package javabean;

import java.util.Scanner;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.println("Enter the ID:");
		e.setId(sc.nextInt());
		System.out.println("Enter the Name:");
		e.setName(sc.next());
		System.out.println("Enter the Salary:");
		e.setSalary(sc.nextDouble());
		System.out.println();
		
		System.out.println("Employee Id:"+e.getId());
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Salary:"+e.getSalary());
		
	}
}
