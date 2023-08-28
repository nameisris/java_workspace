import java.io.IOException;

public class ExceptionTest6 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// method1()을 호출하는 메서드에게 예외 처리를 위임
	// 즉, IOExceptio, Exception 예외는 method1()을 호출할 때, try-catch의 구조로 호출
	static void method1() throws IOException, Exception {
		boolean flag = false;
		
		if(flag) {
			throw new IOException("입출력 예외");
		} else {
			throw new Exception("모든 예외");
		}
	}
}
