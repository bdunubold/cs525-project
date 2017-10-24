package ccard.type;

import ccard.interest.CreditIntrestVisitor;

public class GoldType implements CreditType {

	@Override
	public double accept(CreditIntrestVisitor visitor, double amount) {
		// TODO Auto-generated method stub
		return visitor.visit(this, amount);
	}

}
