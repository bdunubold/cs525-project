package framework;

public class DataMap {
	String accounType;
	String accountNumber;
	String name;
	String street;
	String city;
	String state;
	String zip;
	String birthday;
	String email;
	String numOfEmployees;
	
	public DataMap(String accounType, String accountNumber, String name, String street, String city, String state, String zip, String email) {
		this.accounType = accounType;
		this.accountNumber = accountNumber;
		this.name = name;
		this.street = street;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.email = email;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumOfEmployees() {
		return numOfEmployees;
	}
	public void setNumOfEmployees(String numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	
}
