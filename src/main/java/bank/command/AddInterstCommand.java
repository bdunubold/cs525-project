package bank.command;

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

    }
}
