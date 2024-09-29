package com.Av;

import java.util.Date;
//import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Account[] ref = new Account [10];
		Report[] rep = new Report [50];
		
		int choice=0;
		int f=0;
		int r=0;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("-----------------------------------------------");
			System.out.println("| 1. Open a account                           |");
			System.out.println("| 2. Exiting account                          |");
			System.out.println("| 3. End day report                           |");
			System.out.println("| 4. Exit                                     |");
			System.out.println("-----------------------------------------------");
			choice = sc.nextInt();
			
				switch(choice)
				{
				case 1:
					int in1;
						do {
							System.out.println("-----------------------------------------------");
							System.out.println("| 1. SAVINGS ACCOUNT                          |");
							System.out.println("| 2. SALARY ACCOUNT                           |");
							System.out.println("| 3. CURRENT ACCOUNT                          |");
							System.out.println("| 4. LOAN ACCOUNT                             |");
							System.out.println("| 5. Previous Menu                            |");
							System.out.println("-----------------------------------------------");
                            System.out.println("Enter your choice: ");
							in1 = sc.nextInt();
							Date openDate;
							openDate = new Date();
							
							switch(in1)
							{
								case 1:
									System.out.println("\nDeposit minimum 10000 rs to create account...\n");
				
									System.out.println("Enter name: ");
									String name = sc.next();
									
									System.out.println("Enter account number: ");
									int acc = sc.nextInt();
									
									System.out.println("Enter initial amount to deposit: ");
									double amount1 = sc.nextDouble();
									
									if(amount1 < 10000)
									{
										System.out.println("Can not create the account...");
									}
									else
									{
										ref[f++] = new SavingAccount(name, acc, amount1, "Savings", openDate);
										rep[r++] = new Report(acc, amount1, "Created Account", amount1, openDate);
										System.out.println("Account created sucessfully");
									}
									break;
									
								case 2:
									System.out.println("Enter name: ");
									name = sc.next();
									
									System.out.println("Enter account number: ");
									acc = sc.nextInt();
									
									System.out.println("Enter initial deposit amount: ");
									amount1 = sc.nextDouble();
									
									ref[f++] = new SalaryAccount(name, acc, amount1, "Salary", openDate);
									rep[r++] = new Report(acc, amount1, "Created Account", amount1, openDate);
									System.out.println("Account created sucessfully");
									break;
									
								case 3:
									System.out.println("Enter name: ");
									name = sc.next();
									
									System.out.println("Enter account number: ");
									acc = sc.nextInt();
									
									System.out.println("Enter initial deposit amount: ");
									amount1 = sc.nextDouble();
									
									System.out.println("Enter overdraft limit: ");
									double od = sc.nextDouble();
									
									ref[f++] = new CurrentAccount(name, acc, amount1, "Current", od, openDate);
									rep[r++] = new Report(acc, amount1, "Created Account", amount1, openDate);
									System.out.println("Account created sucessfully");
									break;
									
								case 4:
									System.out.println("Enter name: ");
									name = sc.next();
									
									System.out.println("Enter account number: ");
									acc = sc.nextInt();
									
									System.out.println("Enter loan amount: ");
									amount1 = sc.nextDouble();
									
									ref[f++] = new LoanAccount(name, acc, amount1, "Loan", openDate);
									rep[r++] = new Report(acc, amount1, "Created Account", amount1, openDate);
									System.out.println("Account created sucessfully");
									break;
									
								case 5:
									System.out.println("Previous menu...\n");
					                break;
					            default:
					                System.out.println("Invalid choice. Please try again.\\n");
							}
						}while (in1 != 5);
				break;
					
				case 2:
					int in2;
					
					do {
						System.out.println("\n1. deposit\n2. withdraw\n3. show balance\n4. calculate interest rate\n5. close account\n6. Previous Menu");
						in2 = sc.nextInt();
						
						int i;
						int flag=0;
						Date openDate;
						openDate = new Date();
						
						for(i=0;i<ref.length;i++) {
							
							switch(in2)
							{
								case 1:
									System.out.println("Enter the account number: ");
									int no = sc.nextInt();
									
									System.out.println("Enter amount to deposit: ");
									double amount5 = sc.nextDouble();
										if(no == ref[i].getAccNo())
										{
											ref[i].deposit(amount5);
											flag++;
											rep[r++] = new Report(no, amount5, "Deposit", ref[i].getBalance(), openDate);
										}
									break;
								case 2:										
									System.out.println("Enter the account number: ");
									no = sc.nextInt();
									
									System.out.println("Enter amount to withdraw: ");
									double amount6 = sc.nextDouble();
										if(no == ref[i].getAccNo())
										{
											ref[i].withdraw(amount6);
											flag++;
											rep[r++] = new Report(no, amount6, "Withdraw", ref[i].getBalance(), openDate);
										}
									break;
									
								case 3:
									System.out.println("Enter the account number: ");
									no = sc.nextInt();
									
									if(no == ref[i].getAccNo())
										{
											System.out.println("Balance: "+ref[i].getBalance());
											flag++;
										}
									break;
								
								case 4:
									System.out.println("Enter the account number: ");
									no = sc.nextInt();
										if(no == ref[i].getAccNo())
										{
											ref[i].calInterest();
											flag++;
										}
									break;
								
								case 5:
									System.out.println("Enter account no to close");
									int accNo = sc.nextInt();
									
									for(i=0;i<f;i++)
									{
										if(accNo == ref[i].getAccNo()) {
											for(int k=i;k<f-1;k++) {
												ref[k]  = ref[k+1];
											}
											f--;
											System.out.println("Account Number "+accNo+" has been closed successfully");
										}
										break;
									}
									
								case 6:
									System.out.println("Previous Menu...\n");
					                break;
					                
								default:
					                System.out.println("Invalid choice. Please try again.\\n");
							}
							if(in2 == 6 || flag == 1)
							{
								break;
							}
						}
						if (flag == 0)
						{
							System.out.println("Account not found...");
							break;
						}
					} while (in2 != 6);
				break;
				
				case 3:
					System.out.println("--------------------------"+ "---------------------------------------------------------");
					System.out.println("Account No \t\t Amount \t\t Transaction \t\t Date");
					for(int i=0;i<rep.length;i++)
					{
						rep[i].displayRep();
					}
				break;
				
				case 4:
					System.out.println("Exiting the program...");
					break;
					
				default:
					System.out.println("Invalid choice. Please try again.\\n");
				}
		}while(choice != 4);
	}
}