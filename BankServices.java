package com.demo.banking.service;

import com.demo.banking.Menu.BankAccount;

public class BankServices {
	BankAccount bankacc;
	public BankServices() {
		bankacc = new BankAccount();
	}
	public void GenerateBankAcc()
	{
		bankacc.generateAcc();
	}
	public void show() {
		bankacc.display();
	}
	
	public void deposit() {
		bankacc.addAmount();
	}
	public void withdrawAmount() {
		bankacc.withdrawamount();
	}
	public void update() {
		bankacc.changeAdd();
	}
	
}
