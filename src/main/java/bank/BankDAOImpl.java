package bank;

import framework.AccountDAO;

public class BankDAOImpl extends AccountDAO {


	private static BankDAOImpl accountDAO = new BankDAOImpl();

	public static BankDAOImpl getInstance() {
		return accountDAO;
	}

}
