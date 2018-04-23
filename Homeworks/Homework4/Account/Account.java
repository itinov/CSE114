package Homeworks.Homework4.Account;


import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
		dateCreated = new java.util.Date();
	}

	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		if(balance > amount)
			this.balance -= amount;
		else
			System.out.println("Not enough money in account to withdraw " + amount);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}
