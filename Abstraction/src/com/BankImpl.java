package com;

public class BankImpl implements Bank {

	int bal=5000;
	
	@Override
	public void deposit(int amt) {
		System.out.println("Depositing ₹"+amt);
		bal=bal+amt;
		System.out.println("Amount Deposited successfuly.");
	}

	@Override
	public void withdraw(int amt) {
		System.out.println("Withdrawing ₹"+amt);
		bal=bal-amt;
		System.out.println("Amount withdrawn successfuly.");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Available balance: ₹"+bal);
		
	}

}
