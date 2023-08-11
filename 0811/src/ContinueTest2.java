
public class ContinueTest2 {

	public static void main(String[] args) {
		int sum = 0;
		
		// 4의 배수 or 7의 배수를 제외한 합
		for(int i = 1;i <= 100;i++) {
			if (i % 4 == 0 || i % 7 == 0)
				continue;
			sum += i;
		}

		System.out.println(sum);
	}

}
