package credit.type;

import credit.Visitor;

public class Bronze implements CreditAccountType {

	public Bronze() {

	}

	@Override
	public double accept(Visitor visitor, double amount) {
		return visitor.visit(this, amount);
	}
}
