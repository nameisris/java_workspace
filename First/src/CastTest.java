
public class CastTest {

	public static void main(String[] args) {
		byte bt = 10;
		int i = bt; // int가 byte보다 범위가 넓으므로, 데이터 손실이 잃어나지 않으므로 자동 형변환
		
		// 범위가 넓은 변수형을 낮은 변수형으로 형변환 시, 데이터 손실의 가능성
		// 따라서 강제 형변환
		byte bt2 = (byte) i; // Casting (강제 형변환)
		
		// float는 int보다 실제 더 큰 크기가 들어감 (소수점)
		// 따라서 자동 형변환
		float f = i;
		
		// float => int 강제 형변환
		int i2 = (int) f; // 소수점 잘림
		
		// float => double 형변환
		double d = f;
		
		// double => float 강제 형변환
		float f2 = (float) d;
		
		// Casting은 개발자의 결정
		
		// 자동 형변환 순서
		// byte => short => int => long => float => double
	}

}
