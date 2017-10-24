package credit;

import credit.type.Bronze;
import credit.type.Gold;
import credit.type.Silver;
import framework.AccounTypeEnum;
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

		Account account = new Account(data.getCardNumber());

		account.setCustomer(new Customer(data.getName(), data.getEmail(), address));

		if (data.getAccounTypeEnum() == AccounTypeEnum.GOLD)

			account.setType(new Gold());
		else if (data.getAccounTypeEnum() == AccounTypeEnum.BRONZE)

			account.setType(new Bronze());
		else
			account.setType(new Silver());

		accountDAO.saveAccount(account);

		deposit(account.getAccountNumber(), 1000);

		return account;
	}

}
