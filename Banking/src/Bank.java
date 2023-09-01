import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import acc.Account;
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Scanner sc = new Scanner(System.in);
	Map<String, Account> accs = new TreeMap<>();
	
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
		
		if(accs.containsKey(id)) {
			throw new BankException("계좌 중복", BankError.EXISTID);
		}		
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("임금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		accs.put(id, new Account(id, name, money));
//		accs[accCnt++] = new Account(id, name, money);
	}
	
	void makeSpecialAccount() throws BankException {
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌 번호: ");
		String id = sc.nextLine(); // 문자열 입력
		
		if(accs.containsKey(id)) {
			throw new BankException("계좌 중복", BankError.EXISTID);
		}	
		
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
		
		accs.put(id, new SpecialAccount(id, name, grade, money));
//		accs[accCnt++] = new SpecialAccount(id, name, grade, money);
	}
	
//	Account searchAccById(String id) {
////		Account acc = null;
////		for(int i = 0;i < accs.size();i++) {
////			if(accs.get(i).getId().equals(id)) {
////				return accs.get(i);
////			}
////		}
//		
//		// 향상된 for문
//		for(Account acc: accs) {
//			if(acc.getId().equals(id)) {
//				return acc;
//			}
//		}
//		return null;
//	}
	
	void deposit() throws BankException {
		System.out.println("[입금]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		if(!(accs.containsKey(id))) {
			throw new BankException("계좌 오류", BankError.NOID);
		}
		
		System.out.print("입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
//		Account acc = accs.get(id);
//		acc.deposit(money);
		accs.get(id).deposit(money);
		
		System.out.println("거래 내역");
		System.out.println(accs.get(id));
	}
	
	void withdraw() throws BankException {
		System.out.println("[출금]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		if(!(accs.containsKey(id))) {
			throw new BankException("계좌 오류", BankError.NOID);
		}
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());	
		accs.get(id).withdraw(money);
		
		
		System.out.println("거래 내역");
		System.out.println(accs.get(id));
	}
	
	void accountInfo() throws BankException {
		System.out.println("[계좌 조회]");
		
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		
		if(!(accs.containsKey(id))) {
			throw new BankException("계좌 오류", BankError.NOID);
		}
		
		System.out.println(accs.get(id));
	}
	
	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		// 값만을 조회
		Iterator<Account> it = accs.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(Account acc: accs.values()) {
//			System.out.println(acc);
//		}
	}
	
	public void store_b() {		// binary의 b
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("accs.bin"));
			
			dos.writeInt(accs.size()); // 계좌 개수 저장
			
			for(Account acc : accs.values()) {
				if(acc instanceof SpecialAccount) { // 계좌 종류 구분값
					dos.writeChar('S');
				} else {
					dos.writeChar('N');
				}
				dos.writeUTF(acc.getId()); // 계좌번호
				dos.writeUTF(acc.getName()); // 이름
				dos.writeInt(acc.getBalance()); // 잔액
				
				if(acc instanceof SpecialAccount) {
//					SpecialAccount sacc =(SpecialAccount) acc; // downcasting
//					dos.writeUTF(sacc.getGrade());
					
					// 저장할 때 등급 풀네임으로 저장이 되기에,
					// 생성자에서 가장 첫 글자로만 구분하던 것을
					// 풀네임으로 구분할 수 없기에
					// 첫 글자로 구분하는 if문에 걸쳐지지 않게 되면서
					// 생성자에서 처음에 Normal로 기본적으로 초기화된 값으로만 되는 문제를
					// 파일에 write를 할 때, 등급의 첫 글자만 write 되도록 수정
					dos.writeUTF(((SpecialAccount) acc).getGrade().charAt(0) + ""); // downcasting
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void store_t() {		// text의 t
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("accs.txt"));
			
			for(Account acc : accs.values()) {
				String accStr = acc.getId();
				accStr += "," + acc.getName();

				
				if(acc instanceof SpecialAccount) {
					accStr += "," + ((SpecialAccount) acc).getGrade().charAt(0) + "";
				}
				
				accStr += "," + acc.getBalance();
				
				bw.write(accStr);
				bw.newLine(); // 개행
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void store_s() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("accs.dat"));
			oos.writeObject(accs);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void load_b() {
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream("accs.bin"));
			int count = dis.readInt();
			for(int i = 0;i < count;i++) {
				char sect = dis.readChar(); // 계좌 종류 구분값
				String id = dis.readUTF(); // 계좌번호
				String name = dis.readUTF(); // 이름
				int balance = dis.readInt(); // 잔액
				String grade = "";
				
				if(sect == 'S') { // SpecialAccount일 경우
					grade = dis.readUTF(); // 등급
					accs.put(id, new SpecialAccount(id, name, grade, balance));
				} else { // Account일 경우
					accs.put(id, new Account(id, name, balance));
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void load_t() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("accs.txt"));
			String accStr = null;
			
			while((accStr = br.readLine()) != null) {
//				String[] accProp = accStr.split(",");
//				
//				Account acc = null;
//				
//				String id = accProp[0];
//				String name = accProp[1];
//				int balance = Integer.parseInt(accProp[3]);
//				if(accProp.length == 4) { // , 구분자로 가져온 값들이 4개일 때
//					String grade = accProp[2];
//					accs.put(id, new SpecialAccount(id, name, grade, balance));
//				} else {
//					accs.put(id, new Account(id, name, balance));
//				}

				StringTokenizer st = new StringTokenizer(accStr, ",");
				
				String id = st.nextToken();
				String name = st.nextToken();
				if(st.countTokens() == 2) {
					String grade = st.nextToken();
					int balance = Integer.parseInt(st.nextToken());
					accs.put(id, new SpecialAccount(id, name, grade, balance));
				} else {
					int balance = Integer.parseInt(st.nextToken());
					accs.put(id, new Account(id, name, balance));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void load_s() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("accs.dat"));
			accs = (Map<String, Account>) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		// accs.bin 파일을 프로그램을 실행하고 처음에 불러온 뒤,
		// InputStream을 싱행하는 메서드 내에서 컬렉션 프레임워크에 넣어줄 것임
		bank.load_s();
		int sel;
		
		try {
			while(true) {
				sel = bank.menu();
				
				if(sel == 0) {
					bank.store_s();
					break;
				}
				
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
