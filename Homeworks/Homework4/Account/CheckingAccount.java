package Homeworks.Homework4.Account;


public class CheckingAccount extends Account {

	private double overdraftLimit;

	public CheckingAccount() {
	}
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(double amount) {
		if (amount <= getBalance() + overdraftLimit)
			setBalance(getBalance() - amount);
	}

}
