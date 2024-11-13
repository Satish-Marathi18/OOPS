package org;

import com.Car;

public class CarMainClass {

	public static void main(String[] args) {
		System.out.println("Brand: "+Car.brand);
		
		Car c = new Car();
		c.drive();
	}
}
