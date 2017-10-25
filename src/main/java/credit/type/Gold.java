package credit.type;

import java.io.Serializable;

import credit.Visitor;

public class Gold implements CreditAccountType, Serializable {

	private static final long serialVersionUID = -7324250405405757543L;

	public Gold() {
	}

	@Override
	public String toString() {
		return "Gold";
	}

	@Override
	public double accept(Visitor visitor, double amount) {
		return visitor.visit(this, amount);
	}

}
