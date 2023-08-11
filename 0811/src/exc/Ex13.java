package exc;

public class Ex13 {

	public static void main(String[] args) {
		// 주어진 문자열(value)이 숫자인지 판별
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열과 문자를 하나씩 검사
		for(int i = 0;i < value.length();i++) {
			ch = value.charAt(i);
			if(!(ch >= '0' && ch <= '9')) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

	}

}
