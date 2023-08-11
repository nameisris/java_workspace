package exc;

public class Ex10 {

	public static void main(String[] args) {
		// int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력
		int num = 12345;
		int sum = 0;
		
		while(true) {
			if(num == 0)
				break;
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("sum: " + sum);

	}

}
