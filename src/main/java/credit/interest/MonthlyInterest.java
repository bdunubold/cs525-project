package credit.interest;

import java.io.Serializable;

import credit.type.CreditAccountType;
import framework.InterestStrategy;

public class MonthlyInterest implements InterestStrategy, Serializable {

	private static final long serialVersionUID = 1241249185939102432L;
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
