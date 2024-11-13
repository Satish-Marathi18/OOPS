package rtp;

public class Vehicle {

	void start() {
		System.out.println("Vehicle Started.");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car Started.");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Bike Started.");
	}
}
