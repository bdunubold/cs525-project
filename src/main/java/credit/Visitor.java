package credit;

import credit.type.Bronze;
import credit.type.Gold;
import credit.type.Silver;

public interface Visitor {
	public double visit(Gold accounType, double amount);
	public double visit(Silver accounType, double amount);
	public double visit(Bronze accounType, double amount);
}
