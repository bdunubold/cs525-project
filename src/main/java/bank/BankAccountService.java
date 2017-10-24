package bank;

import bank.customer.CustomerFactory;
import framework.Account;
import framework.AccountDAO;
import framework.AccountServiceImpl;
import framework.Address;

public class BankAccountService extends AccountServiceImpl  {

	public BankAccountService(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account createAccount(String accountNumber, String customerName) {
//		Address address = createAddress(street, city, state, zip);
//		Customer customer = CustomerFactory.
//		Account account = new
//		return account;
		return null;
	}







}
