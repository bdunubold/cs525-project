package credit;

import framework.AccountDAO;

public class CreditDAOImpl extends AccountDAO {

	public static final String STORAGE_TYPE = "CREDIT_ACCOUNTS";

	private static CreditDAOImpl accountDAO = new CreditDAOImpl();

	public static CreditDAOImpl getInstance() {
		return accountDAO;
	}

	@Override
	public String getStorageName() {
		return STORAGE_TYPE;
	}

}
