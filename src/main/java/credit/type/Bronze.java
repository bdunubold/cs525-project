package credit.type;

import credit.Visitor;
import framework.AccountType;

public class Bronze implements CreditAccountType {

	public Bronze() {

	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
