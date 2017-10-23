package bank.customer;

import framework.Account;
import framework.Address;
import framework.Customer;

import java.util.List;

public class Individual extends Customer {
	public Individual(List<Account> accounts, String name, String email, Address address) {
		super(accounts, name, email, address);
	}
}
