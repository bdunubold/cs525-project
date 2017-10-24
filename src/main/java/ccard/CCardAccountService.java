package ccard;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import ccard.type.CreditAccount;
import ccard.type.SilverType;
import framework.Account;
import framework.AccountDAO;
import framework.AccountEntry;
import framework.AccountService;
import framework.Address;
import framework.Card;
import framework.Customer;

public class CCardAccountService extends AccountService {

	public CCardAccountService(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	public Account createAccount(String accountNumber, String customerName, String email, String street, String city,
			String state, String zip) {
		// TODO Auto-generated method stub
		Address address = new Address(street, city, state, zip);
		Account account = new Account(accountNumber);
		account.setCustomer(new Customer(customerName, email, address));
		CreditAccount creditAccount = new CreditAccount();
		creditAccount.setCreditType(new SilverType());
		creditAccount.setCreditLimit(1000);
		account.setAccountType(creditAccount);
		Card card = new Card();
		card.setActive(true);
		card.setCardNumber("100000");

		card.setExpDate(LocalDate.of(LocalDate.now().getYear() + 2, LocalDate.now().getMonth(),
				LocalDate.now().getDayOfMonth()));

		account.setCard(card);

		accountDAO.saveAccount(account);

		return account;
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
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	// charge account
	@Override
	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);

	}

	public void addInterest(String accountNumber) {

		Account account = accountDAO.loadAccount(accountNumber);
		account.addInterest();
	}

	public List<AccountEntry> generateMonthlyReport(String accountNumber) {

		int month = LocalDate.now().getMonthValue();
		int year = LocalDate.now().getYear();
		Account account = accountDAO.loadAccount(accountNumber);
		return account.getReport(month, year);

	}

	@Override
	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account createAccount(String accountNumber, String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
