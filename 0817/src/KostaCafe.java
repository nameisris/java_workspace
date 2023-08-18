import java.util.Scanner;

public class KostaCafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		int money = 0;
		int ordCnt = 0;
		int[] order = new int[10];
		int[] coin = {5000, 1000, 500};
		int[] price = {1500, 2500, 2500, 2000, 3000};
		String[] menu = {"아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카"};

		while(true) {
			System.out.println("[코스타 카페]");
			for(int i = 0;i < menu.length;i++) {
				System.out.println(String.format("%d. %s(%d원)", i + 1, menu[i], price[i]));
			}
			System.out.println("0. 계산");
			System.out.print("선택>");
			
			sel = sc.nextInt();
			
			if(sel == 0) {
				int amount = 0;
				// 1. 주문내역 출력
				System.out.print("주문 내역: ");
				for(int i = 0;i < ordCnt;i++) {
					System.out.print(menu[order[i] - 1] + " ");
					amount += price[order[i] = 1];
				}
				
				// 2. 돈 입력
				System.out.print("돈 투입: ");
				money = sc.nextInt();
				
				// 3. 돈이 부족하면 '돈이 부족합니다' 출력
				if(money < amount) {
					System.out.println("돈 부족");
				} else { // 4. 돈이 부족하지 않으면 잔돈 계산
					int change = money - amount;
					System.out.print("잔돈: ");
					for(int i = 0;i < coin.length;i++) {
						if(change / coin[i] != 0) {
							System.out.println(String.format("%d(%d) ", coin[i], change / coin[i]));
						}
						change %= coin[i];
					}
				}
				
				break;
			}
			
			order[ordCnt++] = sel;
		}
	}

}
