package exc;

public class BaseBallException extends Exception {

	private BaseBallError errCode;
	
	public BaseBallException(String message, BaseBallError errCode) {
		super(message);
		this.errCode = errCode;
	}
	
	@Override
	public String toString() {
		String msg = "[" + super.getMessage() + "]\n";
		
		switch(errCode) {
		case TEAMNOTEXISTED:
			msg += "존재하지 않는 팀입니다.";
			break;
		case TEAMEXISTED:
			msg += "존재하는 팀입니다.";
			break;
		case PLAYERNOTEXISTED:
			msg += "존재하지 않는 선수입니다.";
			break;
		default:
			msg += "일반 오류입니다.";
		}
		return msg;
	}
}
