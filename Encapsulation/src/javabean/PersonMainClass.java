package javabean;

import java.util.Scanner;

public class PersonMainClass {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 Person p = new Person();
		 
		 System.out.println("Enter Your Age:");
		 p.setAge(sc.nextInt());
		 
		 System.out.println("Age:"+p.getAge());
		 
	}
	

}
