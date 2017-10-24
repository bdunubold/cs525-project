package framework;

import bank.interest.InterestVisitor;

public interface InterestStrategy {
	public double calcInterest(double balance);
}
