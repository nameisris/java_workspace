
public class StringPlus {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 20;
		// int v1 = 10, v2 = 20;
		
		int res = v1 + v2;	
		System.out.println(res);
		
		String str1 = "abc";
		String str2 = "def";
		String sres = str1 + str2;
		System.out.println(sres);
		
		System.out.println(str1 + res); // abc30
		
		String seven = "7";
		char seven2 = '7';
		int seven3 = 7;
		
		System.out.println("JackPot! " + seven + seven2 + seven3); // String으로 777
		
		// 서로 다른 변수들의 합의 경우, 가장 왼쪽의 문자열을 따라감 (다만, 뒤에 문자열이 나오는 경우 문자열로 취급)
		System.out.println(seven2 + seven3); // 7의 아스키코드 55 + 7 = 62
		System.out.println(seven2 + seven3 + seven); // seven2 + seven3는 아스키코드, 문자열인 seven과 더해질 때 문자열로 취급되어 627
		
		System.out.println("7" + 7 + 7); // 777
		System.out.println(7 + 7 + "7"); // 147		
	}

}
