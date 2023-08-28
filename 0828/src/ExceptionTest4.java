
public class ExceptionTest4 {
	public static void method1() throws Exception{
		String str = null;
		
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("method1에서 처리");
			throw new Exception("예외 다시 생성");
		}
	}
	
	public static void main(String[] args) throws Exception {
		try {
			method1();
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("main에서 처리");
		}
		System.out.println("main 나머지 처리");
	}
}
