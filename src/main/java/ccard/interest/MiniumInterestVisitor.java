package ccard.interest;

import ccard.type.BronzeType;
import ccard.type.GoldType;
import ccard.type.SilverType;

public class MiniumInterestVisitor implements CreditIntrestVisitor {

	@Override
	public double visit(GoldType gold, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.1;
	}

	@Override
	public double visit(SilverType silverType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.12;
	}

	@Override
	public double visit(BronzeType bronzeType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.14;
	}

	

	

}
