
public class StringTest1 {

	public static void main(String[] args) {
		String str = "a";
		
		str += "b"; // str 변수의 원래 주소가 가리키는 곳의 값을 바꾸는 것이 아닌, 새로운 주소에 ab란 String 값이 들어감
		System.out.println(str);
		
		int n = 10;
		n = 20; // 얘는 원래 주소가 가리키는 곳의 값을 바꿈
		
		String s1 = null;	// s1 레퍼런스 변수에 null
		String s2 = "a";		// s2는 공백이 들어간 곳을 가리키는 주소가 들어감
		System.out.println(s1 == null); // true
		System.out.println(s2 == null); // false
		
//		char c = '';
		char c = ' ';
		
		String s3 = "a";	// a랑 null이 같이 있음
		char c1 = 'a';		// a만 있음
		
		String s4 = new String("abc");
		char[] carr = {'a', 'b', 'c'};
		
		String s5 = new String(carr);
		System.out.println(s4);
		System.out.println(s5);
		
		StringBuffer sb = new StringBuffer("abc");
		String s6 = new String(sb);
		System.out.println(s6);
		
		String bs = "helle";
		// concat은 원래 문자열의 뒤에 문자열을 추가하여, 새로운 변수에 할당
		String cs = bs.concat("world");
		System.out.println(bs);
		System.out.println(cs);
		System.out.println(bs);
		
		System.out.println(cs.contains(bs));
		System.out.println(cs.contains("hello"));
		
		String filename = "test.txt";
		System.out.println(filename.endsWith("hwp"));
		
		String[] files = {"text.txt", "temp.hwp", "backup.txt"};
		for(int i = 0;i < files.length;i++) {
			if(files[i].endsWith("txt")) {
				System.out.println(files[i]);
			}
		}
	}

}
