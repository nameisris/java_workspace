package ex;

public class Ex9 {

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

	public static String delChar(String src, String delCh) {
//		StringBuilder sb = new StringBuilder(src.length());
//		
//		for(int i = 0;i < src.length();i++) {
//			// i번째 인덱스 값을 ch에 초기화
//			char ch = src.charAt(i);
//			
//			// 만일 주어진 문자 ch의 값이 delCh의 값들 중에 없다면
//			if(delCh.indexOf(ch) == -1) {
//				sb.append(ch);
//			}
//		}
		
		// 삭제하고자 하는 기호가 모인 문자열의 값 하나씩을 비교해가며
		// 만약 같은 문자가 있는 경우, sb에서 해당 문자가 있는 인덱스를 가져오며
		// 가져온 인덱스 값이 -1이 아닌 경우 (탐색 성공)
		// 해당 인덱스의 값을 삭제
		StringBuilder sb = new StringBuilder(src);
		for(int i = 0;i < delCh.length();i++) {
			int idx = 0;
			
			// 동일한 값의 인덱스가 없을 때까지 탐색
			while(true) {
				idx = sb.indexOf(delCh.charAt(i) + "");
				
				if(idx < 0)
					break;
				
				sb.deleteCharAt(idx);
			}
		}

		return sb.toString();
	}
}
