package bank.command;

import framework.AccountService;
import ui.bank.command.Command;

public class CompanyAccountCreationCommand implements Command{

private AccountService accountService;

    private CompanyAccountCreationCommand(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
