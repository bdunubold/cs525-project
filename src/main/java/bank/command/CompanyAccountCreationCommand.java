package bank.command;

import framework.Account;
import framework.AccountService;
import framework.DataMap;
import ui.bank.command.Command;

public class CompanyAccountCreationCommand implements Command{

private AccountService accountService;
    private DataMap cAccount;

    public CompanyAccountCreationCommand(AccountService accountService,DataMap cAccount){
        this.accountService = accountService;
        this.cAccount = cAccount;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
