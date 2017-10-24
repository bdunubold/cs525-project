package ccard;

import java.util.Collection;

import framework.Account;
import framework.AccountDAO;
import framework.AccountService;
import framework.DataMap;

public class CCardAccountService extends AccountService {

	public CCardAccountService(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account createAccount(DataMap data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deposit(String accountNumber, double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(String accountNumber, double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		// TODO Auto-generated method stub

	}

}
