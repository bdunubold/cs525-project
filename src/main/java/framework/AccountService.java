package framework;

public interface AccountService {

	public Account createAccount(DataMap params);

	public void deposit(String accountNumber, double amount);

	public void withdraw(String accountNumber, double amount);

	public void addInterest();

	public void generateReport();

}
