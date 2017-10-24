package bank.customer;

import framework.Address;
import framework.Customer;

public class Company extends Customer {
	
	private String numOfEmployees;
	
	public Company(String name, String email, String numOfEmployees, Address address) {
		super(name, email, address);
		this.numOfEmployees = numOfEmployees;
	}

	public String getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(String numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	
}
