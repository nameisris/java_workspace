import java.sql.Connection;
import java.util.List;

public class AccountService {
	public void accountInfo(String id) {
		Connection conn = DAO.getConnection();

		Account acc = DAO.selectAccount(conn, id);
		
		if(acc == null) {
			System.out.println("없는 계좌입니다.");
		} else {
			System.out.println(acc);
		}
		
		DAO.close(conn);
	}
	
	public void makeAccount(Account acc) {
		Connection conn = DAO.getConnection();
		
		Account racc = DAO.selectAccount(conn, acc.getId());
		
		if(racc != null) {
			System.out.println("중복 계좌번호입니다.");
		} else {
			int cnt = DAO.insertAccount(conn, acc);
			
			if(cnt > 0) {
				System.out.println(cnt + "개 계좌가 개설되었습니다.");
			}
		}
		
		DAO.close(conn);
	}
	
	public void deposit(String id, Integer money) {
		Connection conn = DAO.getConnection();
		
		Account acc = DAO.selectAccount(conn, id);
		
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		acc.deposit(money); // 가져온 계좌 객체에 입금
		
		if(DAO.updateAccount(conn, acc) > 0) {
			System.out.println(String.format("%s계좌 잔액은 %d원입니다", acc.getId(), acc.getBalance()));
		}
		DAO.close(conn);
	}
	
	public void withdraw(String id, Integer money) {
		Connection conn = DAO.getConnection();
		
		Account acc = DAO.selectAccount(conn, id);
		
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		
		acc.withdraw(money);
		
		// update 횟수가 0보다 클 때
		if(DAO.updateAccount(conn, acc) > 0) {
			System.out.println(String.format("%s계좌 잔액은 %d원입니다", acc.getId(), acc.getBalance()));
		}
		
		DAO.close(conn);
	}
	
	public void allAccountInfo() {
		Connection conn = DAO.getConnection();
		
		List<Account> accs = DAO.selectAccountList(conn);
		
		for(Account acc : accs) {
			System.out.println(acc);
		}
	}
}
