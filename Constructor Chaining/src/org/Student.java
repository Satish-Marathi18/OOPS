package org;

public class Student {
	
	int age;
	String name;
	
	Student(int age){
		this.age=age;
	}
	
	Student(int age, String name){
		this(age);
		this.name=name;
	}
	
	public static void main(String[] args) {
		Student std = new Student(22,"Tom");
		System.out.println(std.age +"  "+std.name);
	}
}
