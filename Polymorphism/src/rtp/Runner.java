package rtp;

public class Runner {
	
	static void display(Vehicle obj) {
		obj.start();
	}

	public static void main(String[] args) {
		//1.upcasting using method
		display(new Car());
		display(new Bike());
		System.out.println("--------------");
		
		//2.upcasting using same reference variable
		Vehicle v;
		v=new Car();
		v.start();
		v=new Bike();
		v.start();
		System.out.println("---------------");
		
		//3.upcasting using different reference variable
		Vehicle v1 = new Car();
		v1.start();
		Vehicle v2 = new Bike();
		v2.start();
	}
}
