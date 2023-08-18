import java.util.Scanner;

/*
 * 1
 * 1	1
 * 1	2	1
 * 1	3	3	1
 * 1	3	6	4	1
 * 1	4	9	10	5	1
 */
// 위의 값 + 위의 왼쪽 값

public class ArrayTest16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		int size = sc.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for(int i = 0;i < size;i++) {
			matrix[i][i] = 1;
		}
		
		for(int i = 1;i < size;i++) {
			for(int j = 0;j < i;j++) {
				matrix[i][j] = matrix[i - 1][j]; // 위 값 가져옴
				if(j > 0) {
					matrix[i][j] += matrix[i - 1][j - 1]; // 위의 왼쪽 값 더해줌 (이미 29행 코드에서 위 값이 더해진 상태)
				}
			}
		}
		
		for(int i = 0;i < size;i++) {
			for(int j = 0;j < i + 1;j++) {
				System.out.print(String.format("%4d", matrix[i][j]));
			}
			System.out.println();
		}
	}

}
