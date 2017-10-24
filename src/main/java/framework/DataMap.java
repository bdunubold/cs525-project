package framework;

import java.time.LocalDate;

public class DataMap {
	private String accountNumber;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String email;
	private AccounTypeEnum typeEnum;

	public DataMap() {
	}

	public AccounTypeEnum getAccounTypeEnum() {
        return typeEnum;
    }

    public void setAccounTypeEnum(AccounTypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }
    
    public AccounTypeEnum getTypeEnum() {
		return typeEnum;
	}

	public void setTypeEnum(AccounTypeEnum typeEnum) {
		this.typeEnum = typeEnum;
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
        return "DataMap{" + "accounType=" + accounTypeEnum + ", accountNumber='" + accountNumber + '\'' + ", name='" +
                name + '\'' + ", street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' +
                ", zip='" + zip + '\'' + ", birthday='" + birthday + '\'' + ", email='" + email + '\'' + ", " +
                "numOfEmployees=" + numOfEmployees + ", clientType=" + clientType + '}';
    }

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public AccountType getAccounType() {
		return accounType;
	}

	public void setAccounType(AccountType accounType) {
		this.accounType = accounType;
	}

	/*public LocalDate getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(LocalDate cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}*/
}
