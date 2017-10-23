package bank.customer;

import framework.Address;
import framework.Customer;

public class CustomerFactory {
	
	public static Customer createIndividual(String name, String email, String birthday, Address address) {
		return new Individual(name, email, birthday, address);
	}
	
	public static Customer createCompany(String name, String email, int numOfEmployees, Address address) {
		return new Company(name, email, numOfEmployees, address);
	}
}
