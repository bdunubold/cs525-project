package bank;

import java.io.Serializable;

import framework.InterestStrategy;

public class CheckingInterest implements InterestStrategy, Serializable {

	private static final long serialVersionUID = -1930533357489222408L;

	@Override
	public double calcInterest(double balance) {
		return balance * 0.03;
	}
}
