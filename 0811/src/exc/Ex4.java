package exc;

public class Ex4 {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상인지 구하라
		int sum = 0, i;
		
		for(i = 1;;i++) {
			if(i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			
			// sum += (i % 2)? -i:i; // 삼항연산자
			if(sum >= 100)
				break;
		}
		
		System.out.println("sum: " + sum + ", i: " + i);
	}

}
