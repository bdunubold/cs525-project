package framework.command.impl;

import framework.AccountService;
import framework.command.Command;

public class WithdrawCommand implements Command{

    private AccountService accountService;
    private String accountNo;
    private double amountWithdraw;

    public WithdrawCommand(AccountService accountService, String accountNo, double amountWithdraw) {
        this.accountService = accountService;
        this.accountNo = accountNo;
        this.amountWithdraw = amountWithdraw;
    }

    @Override
    public void execute() {
        accountService.withdraw(accountNo, amountWithdraw);
    }

    @Override
    public void undo() {
        accountService.deposit(accountNo, amountWithdraw);
    }
}
