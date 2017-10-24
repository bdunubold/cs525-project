package bank.command;

import framework.AccountService;
import framework.DataMap;
import ui.bank.command.Command;

public class PersonalAccountCreationCommand implements Command{

    private AccountService accountService;
    private DataMap personalAccount;

    public PersonalAccountCreationCommand(AccountService accountService, DataMap personalAccount) {
        this.accountService = accountService;
        this.personalAccount = personalAccount;
    }

    @Override
    public void execute() {
        accountService.createAccount(personalAccount);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("undoing Account creation is forbidden!");
    }
}
