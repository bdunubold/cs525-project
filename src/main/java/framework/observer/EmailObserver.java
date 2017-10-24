package framework.observer;

import framework.Customer;

public class EmailObserver implements Observer {

	@Override
	public void update(Object object) {

		Customer customer = (Customer) object;
		System.out.println("Sending email to customer : " + customer.getEmail());
	}

}
