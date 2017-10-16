package service;

import model.Account;

public class AccountServletlmpl extends AbstractAccount {

	@Override
	public int login(String inputName, String inputPassword) {
		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account.getName().equals(inputName) && account.getPassword().equals(inputPassword)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public double queryBalance(int accountIndex) {
		double accont = accounts[accountIndex].getBalance();
		return accont;
	}

	@Override
	public double deposit(int accountIndex, double depositAmount) {
		double balance = accounts[accountIndex].getBalance();
		balance = depositAmount + balance;
		accounts[accountIndex].setBalance(balance);
		return balance;
	}

	@Override
	public double withdraw(int accountIndex, double withdrawAmount) {
		double withdraw = accounts[accountIndex].getBalance();
		if (withdraw < withdrawAmount) {
			return -1;
		}
		withdraw = withdraw - withdrawAmount;
		accounts[accountIndex].setBalance(withdraw);
		return withdraw;
	}

	@Override
	public double changepassword(int accountIndex, String password, String changepassword) {
		String originalPassword = accounts[accountIndex].getPassword();
		if (originalPassword.equals(password)) {
			accounts[accountIndex].setPassword(changepassword);
			return 1;
		}

		return 0;
	}

	@Override
	public double transfer(int accountIndex, String inputName, double transfer) {
		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			double balance = accounts[accountIndex].getBalance();
			if (account.getName().equals(inputName) && accountIndex != i) {
				if (transfer <= balance) {
					balance = balance - transfer;
					accounts[accountIndex].setBalance(balance);
					accounts[i].setBalance(transfer+accounts[i].getBalance());
					return 1;
				} else {
					return -1;
				}
			}
		}
		return 0;
	}
}
