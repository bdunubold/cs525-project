package credit.interest;

import credit.type.CreditAccountType;
import framework.InterestStrategy;

public class MonthlyInterest implements InterestStrategy {

	private CreditAccountType creditType;

	public MonthlyInterest(CreditAccountType creditType) {
		// TODO Auto-generated constructor stub
		this.creditType = creditType;
	}

	@Override
	public double calcInterest(double balance) {

		MonthlyInterestVisitor miniumInterestVisitor = new MonthlyInterestVisitor();
		return creditType.accept(miniumInterestVisitor, balance);
	}
}
