package com.Av;

import java.util.Date;

public class SavingAccount extends Account {

	double minBal = 10000;
	double roi = 0.08;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	

	public SavingAccount(String name, int accNo, double balance, String type, Date openDate) {
		super(name, accNo, balance, type, openDate);
		// TODO Auto-generated constructor stub
	}



	public void withdraw(double amount) {
		if(this.balance-amount < minBal)
		{
			System.out.println("Can't withdraw. Your balance is less than 10000...");
		}
		else
		{
			this.balance = this.balance-amount;
			System.out.printf("Amount withdrawn: "+this.balance);
			System.out.println("\n\n");
		}
	}

	@Override
	public void calInterest() {
		double in= this.balance * roi;
		System.out.println("Interest: "+in);
		}
	

	
	
}
