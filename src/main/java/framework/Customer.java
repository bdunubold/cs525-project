package framework;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	List<Account> accounts = new ArrayList<Account>();
	private String name;
	private String email;

	public void addAccount(Account account) {
		accounts.add(account);
	}

	private List<Account> accountList;

	private Address address;

	public Customer(List<Account> accounts, String name, String email, Address address) {
		this.accounts = accounts;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return getName();
	}

}
