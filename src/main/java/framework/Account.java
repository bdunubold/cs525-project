package framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account {

	private Customer customer;
	private AccountType accountType;
	private Card card;
	private String accountNumber;
	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();

	private InterestStrategy interestStrategy;

	public InterestStrategy getInterestStrategy() {
		return interestStrategy;
	}

	public void setInterestStrategy(InterestStrategy interestStrategy) {
		this.interestStrategy = interestStrategy;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public void setEntryList(List<AccountEntry> entryList) {
		this.entryList = entryList;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}
		return balance;
	}

	public void deposit(double amount) {
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		entryList.add(entry);
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		entryList.add(entry);
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());

		entryList.add(fromEntry);

		toAccount.addEntry(toEntry);
	}

	public void addInterest() {

		double interest = interestStrategy.calcInterest(getBalance());
		AccountEntry entry = new AccountEntry(interest, "interest", "", "");
		entryList.add(entry);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}

	public List<AccountEntry> getReport(int month, int year) {

		List<AccountEntry> list = new ArrayList<>();
		for (AccountEntry entry : entryList) {
			if (entry.getDate().getMonthValue() == month && entry.getDate().getYear() == year)
				list.add(entry);
		}

		return list;
	}

}
