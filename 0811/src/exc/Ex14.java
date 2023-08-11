package exc;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 1 ~ 10 사이의 임의의 값을 얻어서 answer에 저장
		int answer = (int) (Math.random() * 10) + 1;
		
		int input = 0; // 사용자 입력
		int count = 0; // 시도 횟수
		
		Scanner sc = new Scanner(System.in);
		
		do {
			if(count == 0) {
				System.out.println("1과 100 사이의 값을 입력하세요: ");
			} else {
				if(input > answer) {
					System.out.println("입력한 값보다 작습니다.");
				} else if (input < answer) {
					System.out.println("입력한 값보다 큽니다.");
				} else {
					count++;
					System.out.println("맞췄습니다.\n시도횟수는 " + count +"입니다.");
					break;
				}
			}
			count++;
			System.out.println("1과 10 사이의 값을 입력: ");
			input = sc.nextInt(); // 입력받은 값을 변수 input에 저장
			if(answer == input) {
				System.out.println("맞췄습니다.\n시도횟수는 " + count +"입니다.");
				break;
			}
		} while(true);

	}

}
