package credit.interest;

import credit.Visitor;
import credit.type.Bronze;
import credit.type.Gold;
import credit.type.Silver;

public class MinimumPaymentVisitor implements Visitor {

	@Override
	public double visit(Gold gold, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.1;
	}

	@Override
	public double visit(Silver silverType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.12;
	}

	@Override
	public double visit(Bronze bronzeType, double amount) {
		// TODO Auto-generated method stub
		return amount * 0.14;
	}
	

}
