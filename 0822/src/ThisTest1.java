
public class ThisTest1 {

	public static void main(String[] args) {
		Account acc1 = new Account("10001", "홍길동", 100000);
		
	}

}

class Account {
	String id;
	String name;
	int balance;
	
	Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
}