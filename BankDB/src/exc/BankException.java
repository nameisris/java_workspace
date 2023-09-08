package exc;

public class BankException extends Exception {
	// 예외 처리 클래스 BackException 생성
	// Exception으로부터 상속 받음
	private BankError errCode;

	public BankException(String message, BankError errCode) {
		super(message);
		this.errCode = errCode;
	}
	
	@Override
	public String toString() {
		String msg = "[" + super.getMessage() + "]\n";
		
		switch(errCode) {
		case NOID: 
			msg += "계좌 번호 오류입니다.";
			break;
		case EXISTID:
			msg += "계좌 번호가 중복됩니다.";
			break;
		case LACK:
			msg += "잔액이 부족합니다.";
			break;
		case MINUS:
			msg += "입금액 오류입니다.";
			break;
		case MENU:
			msg += "잘못 선택했습니다.";
			break;
		default:
			msg += "일반 오류입니다.";
		}
		
		return msg;
	}
}
