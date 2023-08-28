package acc;

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

	public String info() {
		return String.format("고객번호: %s, 이름: %s, 잔액: %d", id, name, balance);
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			balance -= money;			
		}
	}
}