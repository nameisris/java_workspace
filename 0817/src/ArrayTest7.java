
public class ArrayTest7 {

	public static void main(String[] args) {
		int[][] narr = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120},
		};
		
		int[][] result = new int[narr.length + 1][narr[0].length + 1];
		
		for(int i = 0;i < result.length;i++) { // 행 수만큼 반복 (4)
			for(int j = 0;j < result[i].length;j++) { // 열 수만큼 반복 (5)
				if(i < result.length - 1 && j < result[i].length - 1) {
					result[i][j] = narr[i][j]; // 각 행, 열에 해당하는 값으로 초기화
					
					result[i][result[i].length - 1] += result[i][j]; // 마지막 열에 값 누적
					
					result[result.length - 1][j] += narr[i][j]; // 마지막 행에 값 누적
					
					result[result.length - 1][result[i].length - 1] += narr[i][j];
				}
				System.out.print(String.format("%4d", result[i][j]));
			}
			System.out.println();
		}
	}

}
// 10   20   30   40  100
// 50   60   70   80  260
// 90  100  110  120  420
// 150 180  210  240  780