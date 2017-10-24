package ccard.interest;

import ccard.type.BronzeType;
import ccard.type.GoldType;
import ccard.type.SilverType;

public interface CreditIntrestVisitor {
	
	public double visit(GoldType gold, double amount);
	public double visit(SilverType silverType, double amount);
	public double visit(BronzeType bronzeType, double amount);

}
