package ex;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		String str = "가나다";

		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬
	}
	
	public static String format(String str, int length, int alignment) {
		// 1
		if(length < str.length()) {
			return str.substring(0, length - 1);
		}
		
		// 2
		char[] carr = new char[length];
		for(int i = 0;i < carr.length;i++) {
			carr[i] = ' ';
		}
		
		// 3
		int space = 0;
		if(alignment == 1) {
			space = (length - str.length()) / 2;
		} else if(alignment == 2) {
			space = length - str.length();
		}
		
		if(space < 0 && space > 2) {
			return "정렬 방법 입력 오류";
		}
		
		System.arraycopy(str.toCharArray(), 0, carr, space, str.length());
		
		// 4
		return new String(carr);
	}

}
