package framework.command.impl;

import framework.AccountService;
import framework.DataMap;
import framework.command.Command;

public class GenBillCommand implements Command{

    private AccountService accountService;
    private String billString;

    public GenBillCommand(AccountService accountService) {
        this.accountService = accountService;
    }


    @Override
    public void execute() {
        billString = accountService.generateReport();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("undoing genBill is forbidden!");
    }

    public String getBillString() {
        return billString;
    }
}
