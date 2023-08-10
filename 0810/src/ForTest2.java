
public class ForTest2 {

	public static void main(String[] args) {
		for(int j = 1;j <= 9;j++) {
			for (int i = 2;i <= 9;i++) {
				// System.out.println("2 x " + i + " = " + 2 * i);
				System.out.print(String.format("%d x %d = %2d\t", i, j, i * j));
				// %2d: 두 자리 수에 맞춰 출력. 한 자리 수는 앞에 빈 칸이 하나 들어감. 두 자리 이상은 무시.
			}
			
			System.out.println();
		}

	}

}
