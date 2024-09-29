package com.Av;

import java.util.Date;

public abstract class Account {

	String name;
	int accNo;
	double balance;
	String type;
	Date openDate;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String name, int accNo, double balance, String type, Date openDate) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.openDate = openDate;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public void deposit(double amount) {
		this.balance+= amount;
		System.out.println("Amount deposited: "+amount);
	}
	
	public abstract void withdraw(double amount);
	
	public abstract void calInterest();
	
	
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("Ac9count No: "+accNo);
		System.out.println("Balance: "+balance);
		System.out.println("Account Type: "+type);
	}
}
