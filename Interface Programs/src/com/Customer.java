package com;

public class Customer implements Swiggy {

	public void orderFood() {
		System.out.println("Ordering Food");
	}
	
	public void pay() {
		System.out.println("Paying Amount");
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.orderFood();
		c.pay();
	}
}
