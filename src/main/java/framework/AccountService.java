package framework;

import framework.observer.Observable;

public interface AccountService extends Observable {

	public Account createAccount(DataMap params);

	public void deposit(String accountNumber, double amount);

	public void withdraw(String accountNumber, double amount);

	public void addInterest();

	public void generateReport();

}
