package framework;

public class DataMap {
	private AccounTypeEnum accounType;
    private String accountNumber;
    private String name;
    private String customerType;
    public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	private String street;
    private String city;
    private String state;
    private String zip;
    private String birthday;
    private String email;
    private int numOfEmployees;

    private ClientType clientType;
	
	public DataMap(AccounTypeEnum accounType, String accountNumber,
                   String name, String street, String city, String state,
                   String zip, String email, int numOfEmployees, ClientType clientType) {
		this.accounType = accounType;
		this.accountNumber = accountNumber;
		this.name = name;
		this.street = street;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.email = email;
        this.numOfEmployees = numOfEmployees;
        this.clientType = clientType;
	}

    public AccounTypeEnum getAccounType() {
        return accounType;
    }

    public void setAccounType(AccounTypeEnum accounType) {
        this.accounType = accounType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "DataMap{" + "accounType=" + accounType + ", accountNumber='" + accountNumber + '\'' + ", name='" +
                name + '\'' + ", street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' +
                ", zip='" + zip + '\'' + ", birthday='" + birthday + '\'' + ", email='" + email + '\'' + ", " +
                "numOfEmployees=" + numOfEmployees + ", clientType=" + clientType + '}';
    }
}
