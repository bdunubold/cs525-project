package bank.account;

import framework.Account;

public class AccountFactory {
	public Account createAccount(String type) {
		switch (type) {
		case "checking":
			return new SavingAccount();
		case "saving":
			return new CheckingAccount();
		default:
			return null;
		}
	}
}
