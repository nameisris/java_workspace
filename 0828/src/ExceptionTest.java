
public class ExceptionTest {

	public static void main(String[] args) {
//		String str = null;
//		
//		// java.lang.NullPointerException
//		System.out.println(str.toString());
//		try {
//			System.out.println(str.toString());
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("예외: null입니다");
//		}
//		
//		System.out.println("종료");
		
		String str = "hong";
		int[] arr = new int[5];
		
		try {
			System.out.println(str.toString());
			for(int i = 0;i < arr.length;i++) {
				arr[i] = i * 10;
			}
		} catch(NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("종료");
	}

}
