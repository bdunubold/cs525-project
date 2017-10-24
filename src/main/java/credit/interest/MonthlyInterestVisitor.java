package credit.interest;

import credit.Visitor;
import credit.type.Bronze;
import credit.type.Gold;
import credit.type.Silver;

public class MonthlyInterestVisitor implements Visitor {

	@Override
	public double visit(Gold gold, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.06;
	}

	@Override
	public double visit(Silver silverType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.08;
	}

	@Override
	public double visit(Bronze bronzeType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.1;
	}

}
