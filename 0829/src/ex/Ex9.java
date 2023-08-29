package ex;

public class Ex9 {

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

	public static String delChar(String src, String delCh) {
		StringBuilder sb = new StringBuilder(src.length());
		
		for(int i = 0;i < src.length();i++) {
			// i번째 인덱스 값을 ch에 초기화
			char ch = src.charAt(i);
			
			// 만일 주어진 문자 ch의 값이 delCh의 값들 중에 없다면
			if(delCh.indexOf(ch) == -1) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}
