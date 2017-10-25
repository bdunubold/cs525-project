package bank;

import java.io.Serializable;

import framework.Account;
import framework.AccountType;

public class SavingAccountType implements AccountType, Serializable {

	private static final long serialVersionUID = 8945164234012335778L;

    public void setStrategy(Account account)
    {
        account.setInterest(new SavingInterest());
    }
}
