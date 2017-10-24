package bank.command;

import framework.AccountService;
import ui.bank.command.Command;

public class DepositCommand implements Command{

private AccountService accountService;

    private DepositCommand(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
