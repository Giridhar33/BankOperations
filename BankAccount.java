package com.demo.banking.Menu;

import java.util.Scanner;
import com.demo.banking.pojo.Depositor;
public class BankAccount {
	Depositor dep[];
	Scanner sc;
	public BankAccount() {
		sc = new Scanner(System.in);
		
	}
	public void generateAcc()
	{
		System.out.println("Enter how many Account do you want ");
		int size = sc.nextInt();
		dep = new Depositor[size];
		final String s = "BA";
		int count = 1000;
		for(int i=0;i<dep.length;i++) {
			dep[i] = new Depositor();
			String accno = s+count;
			System.out.println("The bank account is "+accno);
			count++;
			dep[i].setAccountnumber(accno);
			System.out.println("Enter depositor name ");
			dep[i].setDepositorname(sc.next());
			System.out.println("Enter depositor address ");
			dep[i].setAddress(sc.next());
			System.out.println("Enter account type ");
			dep[i].setAcctype(sc.next());
			
		}
		
	}
	
	public void display() {
		for(Depositor d : dep) {
			System.out.println("Depositor name is "+d.getDepositorname());
			System.out.println("Depositor address is "+d.getAddress());
			System.out.println("Depositor account type is "+d.getAcctype());
			System.out.println("Balance in the account is "+d.getAccountnumber()+" "+d.getBalance());
			System.out.println("Number of transcations made "+d.getAccountnumber()+" "+d.getTransactions());
		}
	}
	
	public void addAmount()
	{
		System.out.println("Enter the account number to add amount");
		String s1 = sc.next();
		for(Depositor d : dep) {
			if(s1.equals(d.getAccountnumber())) {
				double bal=d.getBalance();
				System.out.println("Enter the amount to add to "+d.getAccountnumber());
				double bal1=sc.nextDouble();
				bal=bal1+bal;
				d.setBalance(bal);
				
			}
		}
		
	}
	
	public void withdrawamount() {
		System.out.println("Enter the account number to withdraw");
		String s1=sc.next();
		for(Depositor d : dep) {
			if(s1.equals(d.getAccountnumber())) {
				double bal = d.getBalance();
				System.out.println("Enter the amount to withdraw from "+d.getAccountnumber());
				double bal1 = sc.nextDouble();
				if(bal > bal1) {
					bal=bal-bal1;
					d.setBalance(bal);
				}
				else
				{
					System.out.println("You dont have sufficient balance in your account");
				}
			}
		}
	}
	public void changeAdd() {
		System.out.println("Enter account number to change address");
		String s1=sc.next();
		for(Depositor d:dep) {
			if(s1==d.getAccountnumber()) {
				System.out.println("Enter the new address ");
				d.setAddress(sc.next());
			}
		}
	}
	

}
