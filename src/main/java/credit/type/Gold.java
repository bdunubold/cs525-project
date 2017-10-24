package credit.type;

import credit.Visitor;

public class Gold implements CreditAccountType {

	public Gold() {
	}

	@Override
	public double accept(Visitor visitor, double amount) {
		return visitor.visit(this, amount);
	}

}
