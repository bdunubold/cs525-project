package bank;

import framework.InterestStrategy;

public class SavingInterest implements InterestStrategy {

	@Override
	public double calcInterest(double balance) {
		return balance * 0.06;
	}
}
