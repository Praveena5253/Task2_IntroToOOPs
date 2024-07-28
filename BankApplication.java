package com.task2;

import java.util.Scanner;

class Bank {
	private long accno;
	private float balance;

	public Bank() {
	}

	public Bank(long accno, float balance) {
		this.accno = accno;
		this.balance = balance;
	}

	public void deposit(int amt) {
		balance = balance + amt;
		System.out.println("Balance amount after your deposit: " + balance);
	}

	public void withdraw(int amt) {
		if(balance > amt) {
			balance = balance - amt;
			System.out.println("Balance amount after your withdraw: " + balance);
		}
		else
			System.out.println("Transaction failed due to insufficient balance!!");
	}

	public void chkbalance() {
		System.out.println("Account number: " + accno);
		System.out.println("Outstanding balance: " + balance);
	}
}

public class BankApplication {

	public static void main(String[] args) {
		int ch, damt, wamt;
		Scanner s = new Scanner(System.in);
		Bank b = new Bank(834562993, 5000);
		do {
		System.out.println("\nBanking Application");
		System.out.println("-------------------");
		System.out.println("\n1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
		System.out.println("4. Exit");
		System.out.println("\nEnter your choice: ");
		ch = s.nextInt();
		switch(ch) {
		case 1: System.out.println("Enter the amount to deposit: ");
		damt = s.nextInt();
		b.deposit(damt);
		break;

		case 2: System.out.println("Enter the amount to withdraw: ");
		wamt = s.nextInt();
		b.withdraw(wamt);
		break;

		case 3: b.chkbalance();
		break;
		
		case 4: System.out.println("\nThank you for banking with us!!");
		break;
		
		default: System.out.println("Invalid choice");
		}
		} while(ch == 1 || ch == 2 || ch == 3);
	}	
}
