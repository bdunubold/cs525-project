package bank;

import java.io.Serializable;

import framework.InterestStrategy;

public class SavingInterest implements InterestStrategy, Serializable {

	private static final long serialVersionUID = 9088823533437732408L;

	@Override
	public double calcInterest(double balance) {
		return balance * 0.06;
	}
}
