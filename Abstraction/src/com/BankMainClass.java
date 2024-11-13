package com;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new BankImpl();
		
		bank.checkBalance();
		System.out.println("----------------------");
		
		System.out.println("Enter amount to be deposit:");
		int a= sc.nextInt();
		
		bank.deposit(a);
		bank.checkBalance();
		System.out.println("----------------------");
		
		System.out.println("Enter amount to be withdraw:");
		int b= sc.nextInt();
		
		bank.withdraw(b);
		bank.checkBalance();
	}
}
