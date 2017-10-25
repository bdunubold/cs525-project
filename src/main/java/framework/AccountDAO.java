package framework;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;

public abstract class AccountDAO {

	public static final String OUTPUT_DIR = System.getProperty("user.dir") + "\\src\\main\\java\\dataaccess\\storage";
	Collection<Account> accountlist = new ArrayList<Account>();

	public AccountDAO() {
		Object storedAccounts = readFromStorage();

		if (storedAccounts != null) {
			try {
				accountlist.addAll((ArrayList<Account>) storedAccounts);
			} catch (Exception e) {
			}
		}
	}

	public abstract String getStorageName();

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new

		saveToStorage(accountlist);
	}

	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountNumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new

			saveToStorage(accountlist);
		}

		accountlist.forEach(e -> System.out.println("for each e.getBalance(): " + e.getBalance()));

	}

	public Account loadAccount(String accountNumber) {
		for (Account account : accountlist) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountlist;
	}

	public void saveToStorage(Object ob) {
		ObjectOutputStream out = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, getStorageName());
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(ob);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}
		}
	}

	public Object readFromStorage() {
		ObjectInputStream in = null;
		Object retVal = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, getStorageName());
			in = new ObjectInputStream(Files.newInputStream(path));
			retVal = in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
				}
			}
		}
		return retVal;
	}
}
