package credit.type;

import credit.Visitor;
import framework.AccountType;

public class Silver implements CreditAccountType {

	private AccountType accounType;
	
	public Silver(AccountType accounType) {
		this.accounType = accounType;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit((Silver) accounType);
	}

}
