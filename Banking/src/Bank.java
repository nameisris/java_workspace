import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	Account[] accs = new Account[100];
	int accCnt;
	
	int menu() {
		System.out.println("[코스타 은행]");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println("0. 종료");
		System.out.print("선택>> ");
		return Integer.parseInt(sc.nextLine()); // 엔터를 제거하기 위해 sc.nextInt() 대신 사용
	}
	
	void makeAccount() {
		System.out.println("[계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine(); // 문자열 입력
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("임금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		accs[accCnt++] = new Account(id, name, money);
	}
	
	Account searchAccById(String id) {
		Account acc = null;
		for(int i = 0;i < accCnt;i++) {
			if(accs[i].id.equals(id)) {
				return accs[i];
			}
		}
		return null;
	}
	
	void deposit() {
		System.out.println("[입금]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
		
		System.out.println("거래 내역");
		acc.info();
	}
	
	void withdraw() {
		System.out.println("[출금]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
		
		System.out.println("거래 내역");
		acc.info();
	}
	
	void accountInfo() {
		System.out.println("[계좌 조회]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		System.out.println(acc.info());
	}
	
	void allAccountInfo() {
		for(int i = 0;i < accCnt;i++) {
			System.out.println(accs[i].info());
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		
		while(true) {
			sel = bank.menu();
			
			if(sel == 0)
				break;
			
			switch(sel) {
			case 1:
				bank.makeAccount();
				break;
			case 2:
				bank.deposit();
				break;
			case 3:
				bank.withdraw();
				break;
			case 4:
				bank.accountInfo();
				break;
			case 5:
				bank.allAccountInfo();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	}
}
