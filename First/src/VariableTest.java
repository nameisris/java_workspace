
public class VariableTest {
	
	public static void main(String[] args) {
		char ch = 'A'; // char: 자료형, ch: 변수명, = 대입연산자, 'A': 리터럴 데이터
		
		char up7; // 선언
		up7 = '7'; // 초기화
		
		ch = 'B';
		
		// syso + ctrl + space = 단축키
		System.out.println(ch);
		
		byte b = 127; // byte 범위: -128 ~ 127
		
		int i = 10;
		float f = 1.25f; // 데이터 값을 저장하기 전에 메모리에 double 타입으로 임시 저장되기에, float임을 알도록 하기 위해 f를 붙임
		double d = 3.14; // 64bit 중 52bit를 소수에 사용하기에 오차가 적음
		boolean bl = true;
		String name = "stiven";
		
		// final 선언을 하여 값 변경 불가능 (상수)
		final double PI = 3.14;
	}
}
