package com.demo.banking.pojo;

public class Depositor {
	private String depositorname;
	private String address;
	private String acctype;
	private double balance;
	private String accountnumber;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	private long transactions;
	public String getDepositorname() {
		return depositorname;
	}
	public void setDepositorname(String depositorname) {
		this.depositorname = depositorname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getTransactions() {
		return transactions;
	}
	public void setTransactions(long transactions) {
		this.transactions = transactions;
	}
	

}
