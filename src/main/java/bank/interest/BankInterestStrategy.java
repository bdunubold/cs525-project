package bank.interest;

import bank.type.BankType;
import framework.InterestStrategy;

;

public class BankInterestStrategy implements InterestStrategy {

	private BankType bankType;

	public BankInterestStrategy(BankType bankType) {
		// TODO Auto-generated constructor stub
		this.bankType = bankType;
	}

	@Override
	public double calcInterest(double balance) {

		InterestVisitor interestVisitor = new InterestCalcVisitor();
		return bankType.accept(interestVisitor, balance);
	}



}
