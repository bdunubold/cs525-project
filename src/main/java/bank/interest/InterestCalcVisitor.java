package bank.interest;

import bank.type.CheckingAccount;
import bank.type.SavingAccount;

/**
 * Created by bdunubold on 10/24/17.
 */
public class InterestCalcVisitor implements InterestVisitor {
    @Override
    public double visit(CheckingAccount checking, double balance) {
        return balance * 0.03;
    }

    @Override
    public double visit(SavingAccount saving, double balance) {
        return balance * 0.06;
    }
}
