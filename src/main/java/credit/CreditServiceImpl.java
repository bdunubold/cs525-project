package credit;

import framework.Account;
import framework.AccountService;
import framework.Address;
import framework.Customer;
import framework.DataMap;

public class CreditServiceImpl extends AccountService {

	public CreditServiceImpl() {
		super(CreditDAOImpl.getInstance());
	}

	@Override
	public Account createAccount(DataMap data) {

		Address address = new Address(data.getState(), data.getCity(), data.getState(), data.getZip());

		/*
		 * Account account = new
		 * Account(UUID.randomUUID().toString().replace("-", ""));
		 */
		Account account = new Account(data.getCardNumber());

		account.setCustomer(new Customer(data.getName(), data.getEmail(), address));

		accountDAO.saveAccount(account);

		deposit(account.getAccountNumber(), 1000);

		return account;
	}

}
