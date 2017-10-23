package bank.customer;

import framework.Account;
import framework.Customer;

import java.util.List;

public class Company extends Customer {
	public Company(List<Account> accounts, String name, String street, String city, String state, String zip, String email) {
		super(accounts, name, street, city, state, zip, email);
	}
}
