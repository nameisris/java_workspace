package exc5;

public class Ex6 {

	public static void main(String[] args) {
		// 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산
		// 큰 금액의 동전을 우선적으로 거슬러 주어야 함
		
		int[] coinUnit = {10, 50, 100, 500};
		
		int money = 2680;
		
		System.out.println("money: " + money);
		
		for(int i = 0;i < coinUnit.length;i++) {
			int cnt = 0;
			
			if(money > 500) {
				cnt = money / 500;
				money %= 500;
				System.out.println("500원: " + cnt);
				continue;
			} else if(money > 100) {
				cnt = money / 100;
				money %= 100;
				System.out.println("100원: " + cnt);
				continue;
			} else if(money > 50) {
				cnt = money / 50;
				money %= 50;
				System.out.println("50원: " + cnt);
				continue;
			} else {
				cnt = money / 10;
				money %= 10;
				System.out.println("10원: " + cnt);
			}
		}

	}

}
