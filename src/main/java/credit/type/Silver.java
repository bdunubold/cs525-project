package credit.type;

import java.io.Serializable;

import credit.Visitor;

public class Silver implements CreditAccountType, Serializable {

	private static final long serialVersionUID = -4131205606808648282L;

	public Silver() {
	}

	@Override
	public String toString() {
		return "Silver";
	}

	@Override
	public double accept(Visitor visitor, double amount) {
		return visitor.visit(this, amount);
	}

}
