import java.util.Scanner;

public class TotTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		int money = 0;
		int[] coin = {5000, 1000, 500};
		int[] price = {1500, 2500, 2500, 2000, 3000};
		
		while(true) {
			System.out.println("[코스타 카페]");
			System.out.println("1. 아메리카노(1500원)");
			System.out.println("2. 카페라떼(2500원)");
			System.out.println("3. 카푸치노(2500원)");
			System.out.println("4. 에스프레소(2000원)");
			System.out.println("5. 카페모카(3000원)");
			System.out.println("0. 종료");
			System.out.print("선택>");
			
			sel = sc.nextInt();
			
			if(sel == 0)
				break;
			
			System.out.print("돈을 넣으세요>");
			money = sc.nextInt();
			
			// 지불 금액이 가격보다 적을 경우
			if(money < price[sel - 1]) {
				System.out.println("돈이 부족합니다.");
				continue;
			} else {
				int change = money - price[sel - 1];
				System.out.print("잔돈: ");
				for(int i = 0;i < coin.length;i++) {
					int cnt = change / coin[i];
					if(cnt > 0) {
						System.out.print(coin[i] + "(" + cnt + "), ");
					}
					change %= coin[i];
				}
			}
			System.out.println();
		}
	}

}
