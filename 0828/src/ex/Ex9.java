package ex;

public class Ex9 {

	public static void main(String[] args) {
		try {
			throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
		} catch(UnsupportedFunctionException e) {
			System.out.println(e.getMessage());
		}

	}

}

class UnsupportedFunctionException extends RuntimeException {
	final private int ERR_CODE;
	public UnsupportedFunctionException(String message) {
		super(message);
		ERR_CODE = 100;
	}
	
	public UnsupportedFunctionException(String message, int errCode) {
		super(message);
		ERR_CODE = errCode;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + ERR_CODE + "]" + super.getMessage();
	}
}