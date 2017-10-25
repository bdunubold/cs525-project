package bank;

import framework.AccountDAO;

public class BankDAOImpl extends AccountDAO {

	public static final String STORAGE_TYPE = "BANK_ACCOUNTS";

	private static BankDAOImpl accountDAO = new BankDAOImpl();

	public static BankDAOImpl getInstance() {
		return accountDAO;
	}

	@Override
	public String getStorageName() {
		return STORAGE_TYPE;
	}

}
