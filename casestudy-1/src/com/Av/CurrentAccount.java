package com.Av;

import java.util.Date;

public class CurrentAccount extends Account{

	double overdraft;
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	

	public CurrentAccount(String name, int accNo, double balance, String Type, double overdraft, Date openDate) {
		super(name, accNo, balance, Type, openDate);
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if(amount > this.balance+overdraft)		
		{
			System.out.println("Can not withdraw...");
		}
		else if (amount < balance)
		{
			this.balance = this.balance-amount;
			System.out.printf("Amount withdrawn: ");
			System.out.printf("Avail BAlance",+this.balance);
			System.out.println("\n\n");
		}
		{
			this.balance = 0;
			this.overdraft = amount - this.balance;
		}
	}


	@Override
	public void calInterest() {
		System.out.println("No rate of intrest for current account");
	}
}
