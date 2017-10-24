package bank.command;

import framework.AccountService;
import ui.bank.command.Command;

public class PersonalAccountCreationCommand implements Command{

private AccountService accountService;

    private PersonalAccountCreationCommand(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
