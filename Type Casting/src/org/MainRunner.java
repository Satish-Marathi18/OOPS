package org;

public class MainRunner {
	
	static void display(Person obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			System.out.println("Name:"+s.name);
			s.study();
		}
		else if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			System.out.println("Name:"+e.name);
			e.work();
		}
	}

	public static void main(String[] args) {
		display(new Student());
		System.out.println("------");
		display(new Employee());
		
	}
}
