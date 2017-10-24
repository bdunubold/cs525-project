package ccard.interest;

import ccard.type.CreditType;
import framework.InterestStrategy;

public class MonthlyInterest implements InterestStrategy {

	private CreditType creditType;

	public MonthlyInterest(CreditType creditType) {
		// TODO Auto-generated constructor stub
		this.creditType = creditType;
	}
	
	@Override
	public double calcInterest(double balance) {

		MiniumInterestVisitor miniumInterestVisitor = new MiniumInterestVisitor();
		return creditType.accept(miniumInterestVisitor, balance);
	}

}
