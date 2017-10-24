package bank.interest;

import bank.type.CheckingAccount;
import bank.type.SavingAccount;

/**
 * Created by bdunubold on 10/24/17.
 */
public interface InterestVisitor {

        public double visit(CheckingAccount checking, double amount);
        public double visit(SavingAccount saving, double amount);
}
