package bank.customer;

import framework.Account;
import framework.Address;
import framework.Customer;

import java.util.List;

public class Company extends Customer {
	public Company(List<Account> accounts, String name, String email, Address address) {
		super(accounts, name, email, address);
	}
}
