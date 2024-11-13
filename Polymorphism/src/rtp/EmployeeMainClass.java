package rtp;

class EmployeeMainClass {

	static void display(Employee emp) {
		emp.work();
	}
	
	public static void main(String[] args) {
		
		//1.Upcasting using method
		display(new Developer());
		display(new Tester());
		System.out.println("------------------");
		
		//2.Upcsting using single reference variable
		
		Employee emp;
		emp=new Developer();
		emp.work();
		
		emp=new Tester();
		emp.work();
		System.out.println("------------------");
		
		
		//3.Upcsting using separarte reference variable
		
		Employee e1 = new Employee();
		e1.work();
		Employee e2 = new Employee();
		e2.work();
		
	}
}
