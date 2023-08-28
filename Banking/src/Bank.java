import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Scanner sc = new Scanner(System.in);
	Account[] accs = new Account[100];
	int accCnt;
	
	int menu() throws BankException {
		System.out.println("[코스타 은행]");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println("0. 종료");
		System.out.print("선택>> ");
		
		int sel = Integer.parseInt(sc.nextLine()); // 엔터를 제거하기 위해 sc.nextInt() 대신 사용
		
		if(!(sel >= 0 && sel <= 5)) {
			throw new BankException("메뉴 오류", BankError.MENU); // 강제 예외 발생 (catch 구문 실행)
		}
		
		return sel;
	}
	
	void selAccMenu() throws BankException {
		boolean bool = true;
		while(bool) {
			System.out.println("[코스타 은행]");
			System.out.println("1. 일반 계좌");
			System.out.println("2. 특수 계좌");
			System.out.print("선택>> ");
			int sel = Integer.parseInt(sc.nextLine());
			
			switch(sel) {
			case 1:
				makeAccount();
				bool = false;
				break;
			case 2:
				makeSpecialAccount();
				bool = false;
				break;
			default: // main() 메서드에서 예외 처리
				throw new BankException("메뉴 오류", BankError.MENU);
			}
		}
	}
	
	void makeAccount() throws BankException {
		System.out.println("[일반 계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine(); // 문자열 입력
		
		Account acc = searchAccById(id);
		
		if(acc != null)
			throw new BankException("계좌 중복", BankError.EXISTID);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("임금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		accs[accCnt++] = new Account(id, name, money);
	}
	
	void makeSpecialAccount() throws BankException {
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine(); // 문자열 입력
		
		Account acc = searchAccById(id);
		
		if(acc != null)
			throw new BankException("계좌 중복", BankError.EXISTID);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		String grade;
		while(true) {
			System.out.print("등급 (VIP-V, Gold-G, Silver-S, Normal-N): ");
			grade = sc.nextLine();
			
			if(!grade.equals("V") && !grade.equals("G") && !grade.equals("S") && !grade.equals("N") &&
					!grade.equals("v") && !grade.equals("g") && !grade.equals("s") && !grade.equals("n")) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}

		System.out.print("임금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		accs[accCnt++] = new SpecialAccount(id, name, grade, money);
	}
	
	Account searchAccById(String id) {
		Account acc = null;
		for(int i = 0;i < accCnt;i++) {
			if(accs[i].getId().equals(id)) {
				return accs[i];
			}
		}
		return null;
	}
	
	void deposit() throws BankException {
		System.out.println("[입금]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		
		if(acc == null)
			throw new BankException("계좌 오류", BankError.NOID);
		
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
		
		System.out.println("거래 내역");
		System.out.println(acc);
	}
	
	void withdraw() throws BankException {
		System.out.println("[출금]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		
		if(acc == null)
			throw new BankException("계좌 오류", BankError.NOID);
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());	
		acc.withdraw(money);
		
		
		System.out.println("거래 내역");
		System.out.println(acc);
	}
	
	void accountInfo() throws BankException {
		System.out.println("[계좌 조회]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		
		if(acc == null)
			throw new BankException("계좌 오류", BankError.NOID);
		
		System.out.println(acc);
	}
	
	void allAccountInfo() {
		for(int i = 0;i < accCnt;i++) {
			System.out.println(accs[i]);
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		
		try {
			while(true) {
				sel = bank.menu();
				
				if(sel == 0)
					break;
				
				switch(sel) {
				case 1:
					bank.selAccMenu();
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
		} catch(NumberFormatException e) {
			System.out.println("입력 형식이 맞지 않습니다. 다시 입력하십시오");
		} catch(BankException e) {
			System.out.println(e);
		}


	}
}
