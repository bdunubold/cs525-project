package credit.interest;

import java.io.Serializable;

import credit.type.CreditAccountType;
import framework.InterestStrategy;

public class MinimumPayment implements InterestStrategy, Serializable {

	private static final long serialVersionUID = -982352799923551240L;
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
