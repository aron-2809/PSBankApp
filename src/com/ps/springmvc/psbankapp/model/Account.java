package com.ps.springmvc.psbankapp.model;

public class Account {
	private Integer accountNo;
	private String accountHolderName;
	private Double balance;

	public Account() {
		accountNo = 0;
		accountHolderName = "";
		balance = 0.0;
	}

	public Account(Integer accountNo, String accountHolderName, Double balance) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
