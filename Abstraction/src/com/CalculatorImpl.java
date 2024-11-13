package com;

//rule 2 -> IS-A relationship
public class CalculatorImpl implements Calculator {
	
	//Rule 3 ->Method Overriding
	@Override
	public void add(int x, int y) {
		System.out.println("Sum of "+x+" & "+y+" is "+(x+y));
	}
	
	@Override
	public void mul(int x, int y) {
		System.out.println("Product of "+x+" & "+y+" is "+(x*y));
	}

}
