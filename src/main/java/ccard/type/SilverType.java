package ccard.type;

public class SilverType implements CreditType {

	@Override
	public double getMininumPayment() {
		// TODO Auto-generated method stub
		return 0.12;
	}

	@Override
	public double monthlyInterest() {
		// TODO Auto-generated method stub
		return 0.08;
	}

}
