package bank.customer;

import framework.Address;
import framework.Customer;
import framework.DataMap;

public class CompanyCreator implements CustomerFactory {

	@Override
	public Customer createCustomer(DataMap params) {
		Address address = new Address(params.getStreet(), params.getCity(), params.getState(), params.getZip());
		return new Company(params.getName(), params.getEmail(), params.getNumOfEmployees(), address);
	}

}
