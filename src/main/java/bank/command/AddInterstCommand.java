package bank.command;

import framework.AccountService;
import ui.bank.command.Command;

public class AddInterstCommand implements Command{

private AccountService accountService;

    private AddInterstCommand(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
