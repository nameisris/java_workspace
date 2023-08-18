import java.util.Scanner;

// 규칙: 첫 번째 행은 모두 1로 초기화하며, 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한 것
/*
1 1 1 1 1
1 2 3 4 5
1 3 4 6 10 15
1 4 10 20 35
1 5 15 35 70
*/

public class ArrayTest13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] result = new int[5][5];
		
		for(int i = 0;i < result[0].length;i++) { // result[i]를 하는 경우, i 값의 증가에 따라 i의 범위가 없는 배열인 result[5].length가 되므로
			result[0][i] = 1;
		}
		
		for(int i = 1;i < result.length;i++) {
			for(int j = 0;j < result[i].length;j++) {
				if(j == 0) {
					result[i][j] = 1;
				} else {
					result[i][j] = result[i - 1][j] + result[i][j - 1];
				}
			}
		}
		
		for(int i = 0;i < result.length;i++) {
			for(int j = 0;j < result[i].length;j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
