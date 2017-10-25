package framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import bank.BankDAOImpl;
import bank.CheckingAccountType;
import bank.CheckingInterest;
import credit.CreditDAOImpl;
import credit.interest.MinimumPayment;
import credit.type.Bronze;
import credit.type.CreditAccountType;

public class TestData {

	public static void main(String[] args) {
		//generateAccounts();
		printAccounts();
	}

	public static void generateAccounts() {
		Account credit1 = new Individual("4956879");
		credit1.setType(new Bronze());
		credit1.setInterest(new MinimumPayment(new Bronze()));
		credit1.setCustomer(new Customer("John Smith", "jsmith@smithjey.org",
				new Address("Fairfield", "Iowa", "1000 North 4th St.", "52557")));
		credit1.deposit(500);

		CreditDAOImpl.getInstance().saveAccount(credit1);

		Account bank1 = new Individual("5003129");
		bank1.setType(new CheckingAccountType());
		bank1.setInterest(new CheckingInterest());
		bank1.setCustomer(new Customer("Jane Doe", "jdoe@doejey.org",
				new Address("Fairfield", "Iowa", "1000 North 4th St.", "52557")));
		bank1.deposit(1500);

		BankDAOImpl.getInstance().saveAccount(bank1);
	}

	public static void printAccounts() {
		Account credit1 = CreditDAOImpl.getInstance().loadAccount("4956879");
		Account bank1 = BankDAOImpl.getInstance().loadAccount("5003129");

		System.out.println(credit1.getAccountNumber() + " -> " + credit1.getType());
		System.out.println(bank1.getAccountNumber() + " -> " + bank1.getType());
	}

}
