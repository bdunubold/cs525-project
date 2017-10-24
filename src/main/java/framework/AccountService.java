package framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import framework.observer.Observable;
import framework.observer.Observer;

public abstract class AccountService implements Observable {

	private List<Observer> observers = new ArrayList<>();
	protected AccountDAO accountDAO;

	public AccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public abstract Account createAccount(DataMap params);

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);

		accountDAO.updateAccount(account);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}

	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	public void addInterest() {
		ArrayList<Account> accountList = (ArrayList<Account>) getAllAccounts();
		ArrayList<Account> accountList1 = (ArrayList<Account>) accountList.clone();

		accountList1.forEach(account -> {
			account.addInterest();
			accountDAO.updateAccount(account);
		});
	}

	public void generateReport() {
		// TODO Auto-generated method stub

	}

	// TODO
	/**
	 * update this whatever you change.
	 */
	@Override
	public void notifyAllObservers(Object object) {
		for (Observer observer : observers) {
			observer.update(object);
		}
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

}
