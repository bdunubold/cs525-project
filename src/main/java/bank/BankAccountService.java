package bank;

import framework.Account;
import framework.AccountDAO;
import framework.AccountServiceImpl;
import framework.Address;
import framework.DataMap;

public class BankAccountService extends AccountServiceImpl  {

	public BankAccountService(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account createAccount(DataMap data) {
		Address address = createAddress(data.getStreet(), data.getCity(), data.getState(), data.getZip());
		return null;
	}







}
