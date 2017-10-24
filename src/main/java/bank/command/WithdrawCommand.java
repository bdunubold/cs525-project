package bank.command;

import framework.AccountService;
import ui.bank.command.Command;

public class WithdrawCommand implements Command{

private AccountService accountService;

    private WithdrawCommand(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
