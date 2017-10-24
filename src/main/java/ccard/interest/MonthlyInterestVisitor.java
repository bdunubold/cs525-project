package ccard.interest;

import ccard.type.BronzeType;
import ccard.type.GoldType;
import ccard.type.SilverType;

public class MonthlyInterestVisitor implements CreditIntrestVisitor {

	@Override
	public double visit(GoldType gold, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.06;
	}

	@Override
	public double visit(SilverType silverType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.08;
	}

	@Override
	public double visit(BronzeType bronzeType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.1;
	}

	
	
}
