package credit.type;

import credit.Visitor;
import framework.AccountType;

public class Gold implements CreditAccountType {

	private AccountType accounType;
	
	public Gold(AccountType accounType) {
		this.accounType = accounType;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit((Gold) accounType);
	}

}
