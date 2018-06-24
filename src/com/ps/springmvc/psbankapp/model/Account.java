package com.ps.springmvc.psbankapp.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ps.springmvc.psbankapp.validations.PSCode;

public class Account {

	@NotNull(message="Account# can't be blank")
	private Integer accountNo;
	
	@NotNull(message="Account Holder name can't be blank")
	@Size(min=2, max=50, message="Invalid length for Account Holder Name.")
	@Pattern(regexp="[A-Za-z(\\s)]+", message="Invalid Account Holder Name.")
	private String accountHolderName;
	
	@NotNull(message="Balance amount can't be blank")
	@Min(value=5000, message="Minimum balance must not be less than 5000.")
	private Double balance;
	
	@NotNull(message="Account type can't be blank")
	private String accountType;
	
	@NotNull(message="Date of birth can't be blank")
	@Past(message="Accont can't be created for a person not born.")
	private Date dateOfBirth;
	
	@NotNull(message="Ps code can't be blank")
	@PSCode
	private String psCode;

	public Account() {
		this.accountNo = 0;
		this.accountHolderName = "";
		this.balance = 0.0;
		this.accountType = "";
		this.dateOfBirth = new Date();
		this.psCode = "";
	}

	public Account(Integer accountNo, String accountHolderName, Double balance, String accountType, Date dateOfBirth,
			String psCode) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.dateOfBirth = dateOfBirth;
		this.psCode = psCode;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPsCode() {
		return psCode;
	}

	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

}
