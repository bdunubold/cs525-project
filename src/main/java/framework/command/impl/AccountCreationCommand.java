package framework.command.impl;

import framework.AccountService;
import framework.DataMap;
import framework.command.Command;

public class AccountCreationCommand implements Command{

    private AccountService accountService;
    private DataMap dataMap;

    public AccountCreationCommand(AccountService accountService, DataMap dataMap) {
        this.accountService = accountService;
        this.dataMap = dataMap;
    }

    @Override
    public void execute() {
        accountService.createAccount(dataMap);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("undoing Account creation is forbidden!");
    }
}
