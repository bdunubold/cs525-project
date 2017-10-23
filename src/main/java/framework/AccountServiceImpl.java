package framework;

import java.util.Collection;

public abstract class AccountServiceImpl extends AccountService {
	
	
	public AccountServiceImpl(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}
	/**
	 * we need to override in each service
	 */
	public abstract Account createAccount(String accountNumber, String customerName); 
//	{
//		Account account = new Account(accountNumber);
//		Customer customer = new Customer(customerName);
//		account.setCustomer(customer);
//		
//		accountDAO.saveAccount(account);
//		
//		return account;
//	}

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

	public Address createAddress(String street, String city, String state, String zip) {
		return new Address(street, city, state, zip);
	}


	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
