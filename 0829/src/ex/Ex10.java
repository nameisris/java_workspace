package ex;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		String str = "가나다";

		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
	
	public static String format(String str, int length, int alignment) {
		// 1
		if(length < str.length()) {
			return str.substring(0, length - 1);
		}
		
		// 2
		char[] carr = new char[length];
		
		// 3
		switch(alignment) {
		case 0:
			System.arraycopy(str.toCharArray(), 0, carr, 0, str.length());
			break;
		case 1:
			System.arraycopy(str.toCharArray(), 0, carr, (length / 2) - (str.length() / 2), str.length());
			break;
		case 2:
			System.arraycopy(str.toCharArray(), 0, carr, length - str.length(), str.length());
		}
		
		// 4
//		return Arrays.toString(carr);
		return new String(carr);
	}

}
