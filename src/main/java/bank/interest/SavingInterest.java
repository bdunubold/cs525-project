package bank.interest;

import framework.InterestStrategy;

public class SavingInterest implements InterestStrategy {

	@Override
	public double calcInterest(double balance) {
		double interest = 0;
		if(balance < 1000) interest = balance * (0.01);
		else if(balance > 1000 && balance < 5000 ) interest = balance * (0.02);
		else if(balance > 5000) interest = balance * (0.04);
		return interest;
	}
}
