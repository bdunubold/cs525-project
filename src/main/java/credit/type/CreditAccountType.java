package credit.type;

import credit.Visitor;
import framework.AccountType;

public interface CreditAccountType extends AccountType {
	public void accept(Visitor visitor);
}
