package bank;

import framework.Account;
import framework.AccountType;

public class SavingAccountType implements AccountType {
    public void setStrategy(Account account)
    {
        account.setInterest(new SavingInterest());
    }
}
