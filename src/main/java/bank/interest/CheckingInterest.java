package bank.interest;

import framework.InterestStrategy;

;

public class CheckingInterest implements InterestStrategy {

	@Override
	public double calcInterest(double balance) {
		double interest = 0;
		if(balance < 1000) interest = balance * (0.015);
		else if(balance > 1000) interest = balance * (0.025);
		return interest;
	}
}
