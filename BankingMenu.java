package com.demo.banking.menu;

import java.util.Scanner;

import com.demo.banking.Menu.BankAccount;

public class BankingMenu {
	Scanner sc = new Scanner(System.in);
	BankAccount bankacc;
	public BankingMenu() {
		//sc = new Scanner(System.in);
		bankacc = new BankAccount();
		
	}
	
	public void displayMenu() {
		String choice = "y";
		int c=0;
		while(choice.equals("y")) {
			System.out.println("Enter your choice ");
			System.out.println("1. Insert account ");
			System.out.println("2. Deposit");
			System.out.println("3. withdrawl ");
			System.out.println("4. change address");
			System.out.println("5. view ");
			System.out.println("6. exit");
			c = sc.nextInt();
			switch(c) {
			case 1:
				bankacc.generateAcc();
				break;
			case 2:
				bankacc.addAmount();
				break;
			case 3:
				bankacc.withdrawamount();
				break;
			case 4:
				bankacc.changeAdd();
				break;
			case 5:
				bankacc.display();
				break;
			case 6:
				System.exit(0);
			}
			System.out.println("Do you want to continue (y/n)");
			choice=sc.next();
		}
	}
	public static void main(String[] args) {
		BankingMenu bankm = new BankingMenu();
		bankm.displayMenu();
	}
}
