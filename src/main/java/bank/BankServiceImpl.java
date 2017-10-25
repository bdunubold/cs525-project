package bank;

import framework.*;

public class BankServiceImpl extends AccountService {

	public BankServiceImpl(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account createAccount(DataMap data) {
        Address address = new Address(data.getState(), data.getCity(), data.getState(), data.getZip());
        Account account;
        if(data.getClientType() == ClientType.INDIVIDUAL)
            account = new Individual(data.getAccountNumber());
        else
            account = new CompanyAccount(data.getAccountNumber());
        account.setCustomer(new Customer(data.getName(), data.getEmail(), address));
        BankDAOImpl.getInstance().saveAccount(account);

        switch (data.getAccounTypeEnum()){
            case SAVING:
//                SavingAccountType().setStrategy(account)
                account.setType(new SavingAccountType());
            case CHECKING:
//                CheckingAccountType().setStrategy(account)
                account.setType(new CheckingAccountType());
            default:
                account.setType(null);
        }
        return account;
	}

	@Override
	public String generateReport() {
		// TODO Auto-generated method stub
		return null;
	}
}
