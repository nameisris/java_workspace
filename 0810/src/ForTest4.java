
public class ForTest4 {

	public static void main(String[] args) {
		
		// 별 역순 출력
		// 내부 반복문의 반복 상한을 조절
		for(int i = 0;i < 5;i++) {
			// 반복 횟수가 5 => 1로 감소
			for(int j = 0;j < 5 - i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		// 공백 추가하여 별 역순 출력
		// 공백 출력하는 반복문 추가
		for(int i = 0;i < 5;i++) { // 5번 반복
			
			// 공백 출력 반복문
			for(int j = 0;j < i;j++) { // i의 증가에 따라 반복 횟수 증가 (0~4)
				 System.out.print(" ");
			}
			
			for(int k = 0;k < 5 - i;k++) { // i의 증가에 따라 반복 횟수 감소 (5~1)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
