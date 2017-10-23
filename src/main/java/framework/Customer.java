package framework;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	List<Account> accounts = new ArrayList<Account>();
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String email;
	
	public void addAccount(Account account) {
		accounts.add(account);
	}

	public Customer(List<Account> accounts, String name, String street, String city, String state, String zip, String email) {
		this.accounts = accounts;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return getName(); 
	}
	
}
