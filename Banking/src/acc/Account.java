package acc;

import exc.BankError;
import exc.BankException;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String id, String name, int money) {
		this.id = id;
		this.name = name;
		balance = money; // 매개변수명이 겹치지 않기에, this 사용 않음
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return String.format("고객번호: %s, 이름: %s, 잔액: %d", id, name, balance);
	}
	
	public void deposit(int money) throws BankException {
		if(money <= 0)
			throw new BankException("입금 오류", BankError.MINUS);
		balance += money;
	}
	
	public void withdraw(int money) throws BankException {
		if(balance < money)
			throw new BankException("출금 오류", BankError.LACK);
		balance -= money;
	}
}