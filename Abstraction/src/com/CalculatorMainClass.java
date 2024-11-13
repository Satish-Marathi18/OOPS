package com;

import java.util.Scanner;

public class CalculatorMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two integer values:");
		int x=sc.nextInt();
		int y = sc.nextInt();
		
		//Rule 4 -> Upcasting
		Calculator calc = new CalculatorImpl();
		calc.add(x,y);
		calc.mul(x,y);
		
	}
}
