package ex6;

public class Ex22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

		str = "1234o";
		
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

//	static boolean isNumber(String str) {
//		for(int i = 0;i < str.length();i++) {
//			if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	static boolean isNumber(String str) {
		if(str == null || str.length() == 0) { // str.lenght() == 0 또는 str.equals("")
			return false;
		}
		
		boolean flag = true;
		for(int i = 0;i < str.length();i++) {
			if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
