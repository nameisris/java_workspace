
public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50, 60};
		int[] arr2 = {2, 4, 6, 0, 10};
		int tot = 0;		// sum(arr1[i] / arr2[i])
		int cnt = arr1.length;
		double avg = 0;		// tot / i
		
		for(int i = 0;i < arr1.length;i++) {
			try {
				tot += arr1[i] / arr2[i];
//				System.out.println(arr1[i] / arr2[i]);		
			} catch(ArithmeticException e) {
				cnt--;
//				System.out.println(e.getMessage());
			} catch(ArrayIndexOutOfBoundsException e) {
				cnt--;
//				System.out.println(e.getMessage());
			} catch(Exception e) {
				// ArithmeticException, ArrayIndexOutOfBoundsException에 해당되지 않는 예외일 경우, Exception으로 무조건 예외처리에 걸리도록 하는 것
				// 즉. 최상위 예외 Exception은 맨 마지막에 와야 
			}
			System.out.println(tot);
			System.out.println(tot / (double) cnt);
		}
		System.out.println("종료");
		
	}

}
