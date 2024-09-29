package com.Av;

import java.util.Date;

public class LoanAccount extends Account {

	double loanAmount;
	double intRat = 1.51;
	
	public LoanAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LoanAccount(String name, int accNo, double balance, String type, Date openDate) {
		super(name, accNo, balance, type, openDate);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void withdraw(double amount) {
		System.out.println("Can't withdraw for Loan Account");
	}

	@Override
	public void calInterest() {
		double in= this.balance * intRat;
		System.out.println("Interest: "+in);	
	}
}
