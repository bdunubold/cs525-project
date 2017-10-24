package ccard;

import java.util.Collection;
import java.util.List;

import ccard.interest.MinimumInterest;
import ccard.type.CreditAccount;
import framework.Account;
import framework.AccountDAO;
import framework.AccountEntry;
import framework.AccountService;
import framework.DataMap;
import framework.InterestStrategy;

public abstract class ICCardAccountService extends AccountService {

	public ICCardAccountService(AccountDAO accountDAO) {
		super(accountDAO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
	
	}
	
	public abstract double getMininumPayment(String accountNumber);
	
	public abstract List<AccountEntry> generateMonthlyReport(String accountNumber);

}
