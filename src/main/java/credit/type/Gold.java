package credit.type;

import credit.Visitor;
import framework.AccountType;

public class Gold implements CreditAccountType {

	public Gold() {
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
