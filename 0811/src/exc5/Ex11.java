package exc5;

public class Ex11 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int[][] result = new int[score.length + 1][score[0].length + 1]; // [6][4]
		
		for(int i = 0;i < score.length;i++) {
			for(int j = 0;j < score[i].length;j++) {
				result[i][j] = score[i][j]; // 기존 score 값
				result[i][score[i].length] += score[i][j]; // score 값의 합 (가로 끝에 계속 더해줌)
				
				// 마지막 사이클인 경우 (가로 총합을 완료한 경우)
				if(i == score.length - 1 && j == score[i].length - 1) {
					for(int a = 0;a < result[i].length;a++) {
						for(int b = 0;b < result.length - 1;b++) {
							// [0][a] ~ [4][a]까지만 더해줄 것이므로
							// 이미 [5][a]에 총합 값이 들어갔으므로, 마지막 [5][a]번째까지의 합산은 진행하지 않음
							result[result.length - 1][a] += result[b][a];
						}
					}
				}
			}
		}
		
		for(int i = 0;i < result.length;i++) {
			for(int j = 0;j < result[i].length;j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}

	}

}
