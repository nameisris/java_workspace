import java.util.Scanner;

// 규칙: 첫 번째 행은 모두 1로 초기화하며, 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한 것
/*
1 1 1 1 1
1 2 3 4 5
1 3 4 6 10 15
1 4 10 20 35
1 5 15 35 70
*/

public class ArrayTest13_1 {

	public static void main(String[] args) {
		// 1. 배열 생성
		int[][] matrix = new int[5][6];
		// 2. 첫 행을 1로 초기화
		for(int i = 0;i < matrix[0].length;i++) {
			matrix[0][i] = 1;
		}
		
		// 나머지 행들에 대한 계산
		for(int i = 1;i < matrix.length;i++) {
			for(int j = 1;j < matrix[0].length;j++) {
				matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
			}
		}
		
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 1;j < matrix[i].length;j++) { // 열 하나를 추가해 주었기에, 1열부터
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
