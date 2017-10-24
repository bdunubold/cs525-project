package bank;

import bank.customer.CompanyCreator;
import bank.customer.CustomerFactory;
import bank.customer.IndividualCreateor;
import framework.Account;
import framework.AccountDAO;
import framework.AccountServiceImpl;
import framework.AccountType;
import framework.Address;
import framework.Customer;
import framework.DataMap;

public class BankAccountService extends AccountServiceImpl {

	public BankAccountService(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account createAccount(DataMap data) {

		CustomerFactory factory;
		if (data.getCustomerType() == "company")
			factory = new CompanyCreator();
		else
			factory = new IndividualCreateor();

		Account account = new Account(data.getAccountNumber());
		Customer customer = factory.createCustomer(data);
		Address address = customer.getAddress();
		account.setCustomer(customer);
		account.setAccountType(data.getAccounType());
		return account;
	}

	@Override
	public void addInterest() {
		// TODO Auto-generated method stub
		
	}

}
