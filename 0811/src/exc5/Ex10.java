package exc5;

public class Ex10 {

	public static void main(String[] args) {
		char[] abcCode =
			{'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
			 '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
			 '}', ';', ':', ',', '.', '/'};
			// a, b, c, d ... x, y, z
						// 0	1	 2	  3	   4	5	 6	  7	   8	9
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
			
		String src = "abc123";
		String result = "";
			
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후, result에 저장
		for(int i = 0;i < src.length();i++) {
			// i = 0일 경우
			char ch = src.charAt(i);
					
			// ch 범위
			// 아스키 코드
			// a ~ z : 97~122
			if(ch >= 'a' && ch <= 'z') { // src에서 가져온 char형이 a ~ z 사이의 값이라면
				result += abcCode[ch - 'a']; // ch - 'a' => ch - 97 (abcCode[0] = a이므로
			} else { // (ch >= '0' && ch <= '9')
				result += numCode[ch - '0']; // ch - '0' => ch - 48 => '1' - 48 => 49 - 48 = 1
			}
		}
			
		System.out.println("src: " + src);
		System.out.println("result: " + result);
	}

}
