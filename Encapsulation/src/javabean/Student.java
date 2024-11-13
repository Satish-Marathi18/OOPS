package javabean;

//rule 1
public class Student {

	private int age;  //rule 2
	
	//rule 3a
	public void setAge(int age){  
		this.age=age;
	}
	
	//rule 3b
	public int getAge() {
		return age;
	}
}
