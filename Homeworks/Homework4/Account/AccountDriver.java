package Homeworks.Homework4.Account;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 4
 */

public class AccountDriver {

	public static void main(String[] args) {
		System.out.println("Checking Account: ");
		CheckingAccount account2 = new CheckingAccount(1122, 20000, 150); // id, balance, overdraft limit
		account2.setAnnualInterestRate(4.5); // set interest rate at 4.5%
		account2.withdraw(2500.0); // withdraw $2500
		account2.deposit(3000.0);  // deposit $3000
		System.out.println(" Balance: $" + account2.getBalance());
		System.out.println(" Monthly Interest: " + account2.getMonthlyInterest());
		System.out.println(" Date Created: " + account2.getDateCreated());
	}
}

