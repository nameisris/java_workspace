import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// 생성 타입을 ArrayList로 할 수 있지만
		// 확장성을 위해 List로 많이 쓰임
		List<Account> accs = new ArrayList<>();
		accs.add(new Account("10004", 100));
		accs.add(new Account("10002", 300));
		accs.add(new Account("10003", 200));
		
		Collections.sort(accs, new IdCompare());
		
		// 조회만 할 거면 향상된 for문
//		for(Account acc: accs) {
//			System.out.println(acc);
//		}

		// 반복문에 반복문의 횟수를 체크하는 코드가 들어가면 좋지 않음
		// 중간에 값을 삭제를 하거나 하면 오류 발생 가능성
//		for(int i = 0;i < accs.size();i++) {
//			System.out.println(accs.get(i));
//		}
		
		// 중간에 삽입 or 삭제를 하고 싶을 경우
		// 아래의 반복자를 쓰는 것이 바람직
		Iterator<Account> it = accs.iterator();	// 반복자
		while(it.hasNext()) { // 다음 데이터가 있는지 판단하며, 이후 다음 데이터를 가리키도록 이동
			Account acc = it.next();
			System.out.println(acc);
			
		}
	}
}

class Account {
	String id;
	int balance;
	
	Account() {
		
	}
	
	Account(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호: %s, 잔액: %d", id, balance);
	}
}

class IdCompare implements Comparator<Account> {
	@Override
	public int compare(Account o1, Account o2) {
		return o1.id.compareTo(o2.id);
	}
}