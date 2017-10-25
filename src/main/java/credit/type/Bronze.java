package credit.type;

import java.io.Serializable;

import credit.Visitor;

public class Bronze implements CreditAccountType, Serializable {

	private static final long serialVersionUID = -8864342786735722728L;

	public Bronze() {

	}

	@Override
	public double accept(Visitor visitor, double amount) {
		return visitor.visit(this, amount);
	}
}
