package exc;

public class Ex9 {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력
		String str = "12345";
		int sum = 0;
		
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			
			sum += ch - '0'; // 1은 아스키코드로 49, 0은 아스키코드로 48이으로
		}
		
		System.out.println(sum);

	}

}
