package exc5;

public class Ex15 {

	public static void main(String[] args) {
		// 3m 우물 바닥에 달팽이
		// 달팽이는 낮 동안 벽을 55cm 오름
		// 날이 지면 자야하며, 자는 동안 3cm를 미끄러져 내려옴
		// 달팽이가 우물 밖으로 나오는데 며칠이 걸리는지 구하라
		int depth = 3 * 100, height = 0; // 우물 깊이, 오른 높이
		final int up = 55;
		final int down = 3;
		int days = 1; // 우물 탈출 날짜
		
		while(true) {
			height += up;
			if(height >= depth)
				break;
			days++;
			height -= down;			
		}
			
		System.out.println("탈팽이 " + days + "일만에 탈출 성공");
	}

}
