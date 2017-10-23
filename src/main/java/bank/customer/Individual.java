package bank.customer;

import framework.Address;
import framework.Customer;

public class Individual extends Customer {
	
	private String birthday;
	
	public Individual(String name, String email, String birthday, Address address) {
		super(name, email, address);
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
