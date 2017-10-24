package credit;

import framework.AccountDAO;

public class CreditDAOImpl extends AccountDAO {

	private static CreditDAOImpl accountDAO = new CreditDAOImpl();

	public static CreditDAOImpl getInstance() {
		return accountDAO;
	}

}
