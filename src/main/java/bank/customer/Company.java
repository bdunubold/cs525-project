package bank.customer;

import framework.Address;
import framework.Customer;

public class Company extends Customer {
	
	private int numOfEmployees;
	
	public Company(String name, String email, int numOfEmployees, Address address) {
		super(name, email, address);
		this.numOfEmployees = numOfEmployees;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	
}
