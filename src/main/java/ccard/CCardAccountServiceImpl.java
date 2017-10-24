package ccard;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import ccard.interest.MinimumInterest;
import ccard.interest.MonthlyInterest;
import ccard.type.CreditAccount;
import ccard.type.SilverType;
import framework.Account;
import framework.AccountDAO;
import framework.AccountDAOImpl;
import framework.AccountEntry;
import framework.Address;
import framework.Card;
import framework.Customer;
import framework.DataMap;
import framework.InterestStrategy;

public class CCardAccountServiceImpl extends ICCardAccountService {

	public CCardAccountServiceImpl() {
		super(new AccountDAOImpl());
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account createAccount(DataMap data) {
		// TODO Auto-generated method stub
		Address address = new Address(data.getState(), data.getCity(), data.getState(), data.getZip());

		Account account = new Account(UUID.randomUUID().toString().replace("-", ""));
		account.setCustomer(new Customer(data.getName(), data.getEmail(), address));
		CreditAccount creditAccount = new CreditAccount();
		creditAccount.setCreditType(new SilverType());
		creditAccount.setCreditLimit(1000);
		account.setAccountType(creditAccount);
		Card card = new Card();
		card.setActive(true);

		card.setCardNumber(data.getCardNumber());

		card.setExpDate(LocalDate.now().plusYears(2));

		account.setCard(card);

		accountDAO.saveAccount(account);

		return account;
	}

	@Override
	public Account getAccount(String accountNumber) {
		// TODO Auto-generated method stub
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
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

	@Override
	public double getMininumPayment(String accountNumber) {

		Account account = accountDAO.loadAccount(accountNumber);

		CreditAccount credit = (CreditAccount) account.getAccountType();

		InterestStrategy interest = new MinimumInterest(credit.getCreditType());
		account.setInterestStrategy(interest);

		return account.getInterestStrategy().calcInterest(account.getBalance());
	}

	// charge account
	@Override
	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);

	}

	@Override
	public void addInterest() {

		for (Account account : getAllAccounts()) {

			if (account.getAccountType() instanceof CreditAccount) {
				CreditAccount credit = (CreditAccount) account.getAccountType();

				InterestStrategy interest = new MonthlyInterest(credit.getCreditType());
				account.setInterestStrategy(interest);

				account.addInterest();
				accountDAO.updateAccount(account);
			}

		}
	}

	@Override
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

}
