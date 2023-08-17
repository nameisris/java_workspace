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
		
		for(int i = 0;i < result.length;i++) { // result 행 수인 6만큼 반복
			for(int j = 0;j < result[i].length;j++) { // result 열 수인 4만큼 반복
				if(i < result.length - 1 && j < result[i].length - 1) {
					result[i][j] = score[i][j]; // 기존 score 값
					
					result[i][result[i].length - 1] += result[i][j]; // 마지막 열에 값 누적
					
					result[result.length - 1][j] += score[i][j]; // 마지막 행에 값 누적
					
					result[result.length - 1][result[i].length - 1] += score[i][j]; // (마지막 행, 마지막 열)에 값 누적
				}
				
				/*
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
				*/
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
