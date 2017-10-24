package credit.type;

import credit.Visitor;
import framework.AccountType;

public class Bronze implements CreditAccountType {

	private AccountType accounType;

	public Bronze(AccountType accounType) {
		this.accounType = accounType;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit((Bronze) accounType);
	}
}
