package com.Av;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class SalaryAccount extends SavingAccount{

	LocalDate lastTrans;
	int inactiveMon = 2;
	
	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(String name, int accNo, double balance, String type, Date openDate) {
		super(name, accNo, balance, type, openDate);
		this.lastTrans = LocalDate.now();
	}

	public void deposit(double amount) {
		this.balance+= amount;
		System.out.println("Amount deposited: "+amount);
		this.lastTrans = LocalDate.now();
	}
	
	public boolean isFrozen() {
		if (ChronoUnit.DAYS.between(this.lastTrans, LocalDate.now()) > 60)
			return true;
		else
			return false;
	}
	
	public void withdraw(double amount) {
		if (isFrozen()) {
			System.out.println("This Account Has Been Freezed!");
			
		}
		else if(this.balance-amount < minBal)
		{
			System.out.println("Can't withdraw. Your balance is less than 10000...");
		}
		else
		{
			this.balance = this.balance-amount;
			System.out.printf("Amount withdrawn: "+this.balance);
			System.out.println("\n\n");
			this.lastTrans = LocalDate.now();
		}
			
	}
}
