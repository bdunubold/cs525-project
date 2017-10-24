package bank;

import framework.InterestStrategy;

public class CheckingInterest implements InterestStrategy {

	@Override
	public double calcInterest(double balance) {
		return balance * 0.03;
	}
}
