package exc;

public class Ex15 {

	public static void main(String[] args) {
		// 회문수 판별 (다시합창합시다)
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		// 나머지를 더해주기 전의 값에 미리 10을 곱함 (왼쪽으로 shift)
		while(tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		
		if(number == result)
			System.out.println(number + "는 회문수입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}

}
