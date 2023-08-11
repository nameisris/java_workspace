
public class ContinueTest1 {

	public static void main(String[] args) {
		int sum = 0;
		
		// 1~100 중 짝수만의 합
		for(int i = 1;i <= 100;i++) {
			if (i % 2 == 0)
				sum += i;
		}
		
		// 짝수가 아닐 경우, 다음 반복문으로 넘어감
		for(int j = 1;j <= 100;j++) {
			if(j % 2 != 0)
				continue;
			 sum += j;
		}
		
		System.out.println(sum);

	}

}
