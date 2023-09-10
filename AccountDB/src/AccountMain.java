
public class AccountMain {

	public static void main(String[] args) {
		AccountService service = new AccountService();
		// 계좌 조회
		// service.accountInfo("10003");
		
		// 계좌 개설
		Account acc = new Account("10004", "탁길동", 300000, "VIP");
		service.makeAccount(acc);
		
		// 입금
		// service.deposit("10004", 50000);
		
		// 출금
		// service.withdraw("10004", 20000);
		
		// 전체계좌조회
		// service.allAccountInfo();
	}

}
