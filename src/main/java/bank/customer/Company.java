package bank.customer;

import framework.Account;
import framework.Address;
import framework.Customer;

import java.util.List;

public class Company extends Customer {
	public Company(List<Account> accounts, String name, Address address) {
		super(accounts, name, address);
	}
}
