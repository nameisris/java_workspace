package exc;

public class Ex12 {

	public static void main(String[] args) {
		// 구구단의 일부분을 다음과 같이 출력
		for(int i = 0, dan = 2;i < 3;i++, dan += 3) {
			for(int j = 1;j <= 3;j++) {
				for(int k = dan;k <= ((dan + 2 < 10)? dan + 2:9);k++) {
					System.out.print(String.format("%d * %d = %d\t", k, j, k, k * j));
				}
				System.out.println();
			}
			System.out.println();
		}
	}	
}
