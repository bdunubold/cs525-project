package ccard.type;

public class GoldType implements CreditType {

	@Override
	public double getMininumPayment() {
		// TODO Auto-generated method stub
		return 0.1;
	}

	@Override
	public double monthlyInterest() {
		// TODO Auto-generated method stub
		return 0.06;
	}

}
