package com;

public class Student {

	Student(int age){
		System.out.println("Age: "+age);
	}
	
	Student(String name){
		this(5.8);
		System.out.println("Name:"+name);
	}
	
	Student(double height){
		this(22);
		System.out.println("Height:"+height);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Tom");
	}
}
