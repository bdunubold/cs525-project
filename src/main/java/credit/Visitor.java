package credit;

import credit.type.Bronze;
import credit.type.Gold;
import credit.type.Silver;

public interface Visitor {
	public void visit(Gold accounType);
	public void visit(Silver accounType);
	public void visit(Bronze accounType);
}
