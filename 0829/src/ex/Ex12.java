package ex;

public class Ex12 {
	public static void main(String[] args) {
		for(int i = 0;i < 20;i++) {
			System.out.print(getRand(1, -3) + ", ");
		}
	}
	
	// from부터 to까지 (from이 작을 수 있음)
	public static int getRand(int from, int to) {
		// 2 ~ 8 랜덤값 구하기
		// (int) (Math.random() * (최대값 - 최소값 + 1) + 최소값)
//		int r = (int) (Math.random() * (8 - 2 + 1)) + 2;
		
//		int min = Math.min(from, to);
//		int max = Math.max(from, to);
//		return (int) (Math.random() * (max - min + 1)) + min;
		// max - min <=> Math.abs(from - to) <=> Math(to - from)
		return (int) (Math.random() * (Math.abs(from - to) + 1)) + Math.min(from, to);
	}
}
