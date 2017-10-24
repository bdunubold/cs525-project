package bank;

import framework.Account;
import framework.AccountType;

public class CheckingAccount implements AccountType {

    public void setStrategy(Account account)
    {
        account.setInterest(new CheckingInterest());
    }
}
