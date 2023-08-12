package exc5;

public class Ex7 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		// 문자열을 숫자로 변환
		// 입력한 값이 숫자가 아닐 경우, 예외 발생
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money: " + money);
		
		int[] coinUnit = {500, 100, 50, 10}; // 동전 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전 개수
		
		// 동전 개수 계산 및 거스름 계산
		for(int i = 0;i < coinUnit.length;i++) {
			int coinNum = 0;
			
			coinNum = money / coinUnit[i]; // 거스름할 특정 단위 동전의 개수
			
			if(coinNum > coin[i]) { // 만일, 거스름할 최대 단위 동전의 개수가 부족한 경우
				coinNum = coin[i];
				coin[i] = 0;
			} else {
				coin[i] -= coinNum;
			}
			
			money -= coinUnit[i] * coinNum;
			
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		// 거스름돈이 부족하여, 지불한 금액인 money가 남을 경우
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램 정상 종료
		}
		
		System.out.println("=남은 동전의 개수=");
		
		for(int i = 0;i < coinUnit.length;i++) {
			System.out.println(coinUnit[i] + "원: " + coin[i]);
		}
	}

}
