package bank.customer;

import framework.Customer;
import framework.DataMap;

public interface CustomerFactory {
	public Customer createCustomer(DataMap params);
}
