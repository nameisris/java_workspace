
public class Lotto {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		// 번호 부여
		for(int i = 0;i < ball.length;i++) {
			ball[i] = i + 1;
		}
		
		// ball[0] ~ ball[44] 사이의 랜덤값 추춢
		
		// 0 <= (int) (Math.random() * 45) <45
		
		// 두 개의 인덱스가 가지는 요소를 1000번 교환
		for(int i = 0;i < 1000;i++) {
			// 인덱스의 경우, 중복값이 나올 수 있음
			// 서로 같은 인덱스끼리의 교환은 무의미
			int idx1 = (int) (Math.random() * 45);
			int idx2 = (int) (Math.random() * 45);
			
			int temp = ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = temp;
		}
		
		for(int i = 0;i < 6;i++) {
			System.out.print(ball[i] + " ");
		}

	}

}
