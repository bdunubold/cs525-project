package framework;

import java.util.Collection;

public abstract class AccountService {

	protected AccountDAO accountDAO;

	public AccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;

	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public abstract Account createAccount(String accountNumber, String customerName);

	public abstract Account getAccount(String accountNumber);

	public abstract Collection<Account> getAllAccounts();

	public abstract void deposit(String accountNumber, double amount);

	public abstract void withdraw(String accountNumber, double amount);

	public abstract void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
}
