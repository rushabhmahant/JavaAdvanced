package com.cts.solid;

public class AccountPersistence {
	
	private Account account;
	
	public AccountPersistence(Account a) {
		this.account = a;
	}
	
	public Account persist() {
		//	Persist account object in DB
		//	db.save(this.account)
		return this.account;
	}

}
