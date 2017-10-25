package framework.command.impl;

import framework.AccountService;
import framework.command.Command;

public class AddInterstCommand implements Command{

private AccountService accountService;

    public AddInterstCommand(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void execute() {
accountService.addInterest();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("undoing addInterst is forbidden!");
    }
}
