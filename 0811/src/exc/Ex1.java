package exc;

public class Ex1 {

	public static void main(String[] args) {
		// int형 변수 x가 10보다 크고 20보다 작을 때, true인 조건식
		int x = 10;
		if(x > 10 && x < 20) {
			
		}

		// char형 변수 ch가 공백이나 탭이 아닐 때, true인 조건식
		char ch = 'A';
		if(ch != ' ' || ch != '\t') {
			
		}
		
		// char형 변수 ch가 'x' 또는 'X일 때, true인 조건식
		if(ch == 'x' || ch == 'X') {
			
		}
		
		// char형 변수 ch가 숫자('0' ~ '9')일 때, true인 조건식
		if(ch >= '0' && ch <= '9') {
			
		}
		
		// char형 변수 ch가 영문자(대문자 또는 소문자)일 때, true인 조건식
		// && 연산자가 || 연산자보다 우선순위
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			
		}
		
		// int형 변수 year가 (400으로 나눠떨어지거나) 또는 (4로 나눠떨어지고 100으로 나눠떨어지지 않을 때), true인 조건식
		int year = 2023;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			
		}
		
		// boolean형 변수 powerOn가 false일 때, true인 조건식
		boolean powerOn = false;
		if(powerOn == false) {
			
		}
		if(!powerOn) {
			
		}
		
		// 문자열 참조변수 str이 "yes"일 때, true인 조건식
		String str = "no";
		
		if(str.equals("yes")) {
			
		}
	}

}
