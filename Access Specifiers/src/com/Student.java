package com;

//Accessing public members inside the same class
public class Student {
	public static int age = 22;
	
	public void study() {
		System.out.println("Studying java");
	}
	
	public static void main(String[] args) {
		System.out.println("Age:"+age);
		
		Student s = new Student();
		s.study();
	}

}
