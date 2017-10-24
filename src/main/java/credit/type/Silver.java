package credit.type;

import credit.Visitor;

public class Silver implements CreditAccountType {

	public Silver() {
	}

	@Override
	public double accept(Visitor visitor, double amount) {
		return visitor.visit(this, amount);
	}

}
