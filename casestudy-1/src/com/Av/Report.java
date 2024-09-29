package com.Av;

import java.util.Date;

public class Report {

	int accNo;
	double transation;
	String activity;
	double balance;
	Date tdate;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Report(int accNo, double transation, String activity, double balance, Date tdate) {
		super();
		this.accNo = accNo;
		this.transation = transation;
		this.activity = activity;
		this.balance = balance;
		this.tdate = tdate;
	}



	public void displayRep()
	{
			System.out.println(accNo+"\t\t\t"+transation+"\t\t\t"+activity+"\t\t\t"+balance+"\t\t\t"+tdate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
