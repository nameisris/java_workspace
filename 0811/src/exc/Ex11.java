package exc;

public class Ex11 {

	public static void main(String[] args) {
		// 피보나치(Fibonnaci) 수열은 앞의 두 수를 더해서 다음 수를 만드는 수열
		// 1과 1부터 시작하는 피보나치 수열의 10번째 수를 구하시오
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		
		for(int i = 0;i < 8;i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
		
	}

}
