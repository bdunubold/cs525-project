package ccard.type;

public class BronzeType implements CreditType {

	@Override
	public double getMininumPayment() {
		// TODO Auto-generated method stub
		return 0.14;
	}

	@Override
	public double monthlyInterest() {
		// TODO Auto-generated method stub
		return 0.1;
	}

}
