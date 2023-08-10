
public class BreakTest1 {

	public static void main(String[] args) {
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j < 5;j++) {
				System.out.print("*");
				if(i == j)
					break;
			}
			System.out.println();
		}
		
		// labeled break
		// break 시, 라벨이 붙은 반복문은 탈출
		outer : for(int i = 0;i < 5;i++) {
			for(int j = 0;j < 5;j++) {
				System.out.print("*");
				if(i == j)
					break outer;
			}
			System.out.println();
		}


	}

}
