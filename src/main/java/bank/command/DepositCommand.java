package bank.command;

import framework.AccountService;
import ui.bank.command.Command;

public class DepositCommand implements Command{

private AccountService accountService;
    private String accountNo;
    private double amountDeposit;

    public DepositCommand(AccountService accountService, String accountNo, double amountDeposit){
        this.accountService = accountService;
        this.accountNo = accountNo;
        this.amountDeposit = amountDeposit;
    }

    @Override
    public void execute() {
        accountService.deposit(accountNo,amountDeposit);
    }

    @Override
    public void undo() {
        accountService.withdraw(accountNo,amountDeposit);
    }
}
