package ccard.type;

import ccard.interest.CreditIntrestVisitor;
import framework.InterestStrategy;

public interface CreditType {
	
	public double accept(CreditIntrestVisitor visitor, double amount);
	
	
}
