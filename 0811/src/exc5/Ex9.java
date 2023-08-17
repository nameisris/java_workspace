package exc5;

public class Ex9 {

	public static void main(String[] args) {
		char[][] star = { // [4][5] => [5][4]
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		// 90도 시계방향 회전시킨 값들을 넣을 이차원 배열 result
		char[][] result = new char[star[0].length][star.length]; // 열 크기, 행 크기 (5, 4)
		
		// star 이차원 배열 출력
		for(int i = 0;i < star.length;i++) { // 행
			for(int j = 0;j < star[i].length;j++) { // 열
				System.out.print(star[i][j]); // star 이차원 배열은 순서대로 출력
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0;i < result.length;i++) { // result 행 크기 5
			for(int j = 0;j < result[i].length;j++) { // result 열 크기 4
				result[i][j] = star[3 - j][i];
			}
		}
		
		/*
		// result 배열 값 입력
		for(int i = 0;i < star.length;i++) { // star 행 크기 4
			for(int j = 0;j < star[i].length;j++) { // star 열 크기 5		
				result[j][star.length - 1 - i] = star[i][j];
			}
		}
		*/
		
		// 배열의 모든 요소 출력
		for(int i = 0;i < result.length;i++) { // result 행
			for(int j = 0;j < result[i].length;j++) { // result 열
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
