package bank;

import java.io.Serializable;

import framework.Account;
import framework.AccountType;

public class CheckingAccountType implements AccountType, Serializable {

	private static final long serialVersionUID = 2532350555124046313L;

    public void setStrategy(Account account)
    {
        account.setInterest(new CheckingInterest());
    }
}
