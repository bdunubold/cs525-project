package credit.interest;

import credit.type.CreditAccountType;
import framework.InterestStrategy;

public class MinimumPayment implements InterestStrategy {

	private CreditAccountType creditType;

	public MinimumPayment(CreditAccountType creditType) {
		// TODO Auto-generated constructor stub
		this.creditType = creditType;
	}

	@Override
	public double calcInterest(double balance) {

		MinimumPaymentVisitor miniumInterestVisitor = new MinimumPaymentVisitor();
		return creditType.accept(miniumInterestVisitor, balance);
	}

}
