package credit.type;

import credit.Visitor;
import framework.AccountType;

public class Silver implements CreditAccountType {

	public Silver() {
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
