package ex;

public class Ex6 {

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fileZero(src, 10));
		System.out.println(fileZero(src, -1));
		System.out.println(fileZero(src, 3));

	}
	
	public static String fileZero(String src, int length) {
		if(src == null || src.length() == length) {
			return src;
		} else if(length <= 0) {
			return "";
		} else if(src.length() > length) {
			return src.substring(0, length);
		}
		
		// 4
		char[] carr = new char[length];
		// 5
		for(int i = 0;i < carr.length;i++) {
			carr[i] = '0';
		}
		
		// 6
		// 원본 배열, 원본 시작 포지션, 복제할 배열, 복제본에서 복제받기를 시작할 위치, 복제받을 길이
		System.arraycopy(src.toCharArray(), 0, carr, length - src.length(), src.length());
		
		// 7
		return new String(carr);
	}

}

/*
 * (1) fillZero메서드를 작성하시오.
 * 1. src가 널이거나 src.length()가 length와 같으면 src를 그대로 반환한다.
 * 2. length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환한다.
 * 3. src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환한다.
 * 4. 길이가 legnth인 char배열을 생성한다.
 * 5. 4에서 생성한 char배열을 '0'으로 채운다.
 * 6. src에서 문자배열을 뽑아내서 4에서 생성한 배열에 복사한다.
 * 7. 4에서 생성한 배열로 String을 생성해서 반환한다.
*/
