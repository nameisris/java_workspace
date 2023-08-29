
public class WrapperTest1 {

	public static void main(String[] args) {
		// int와 Integer는 엄연히 다름
		// int는 클래스 타입이 아닌 자료형
		int m = 10;
		Integer n = m; // Boxing
		// int가 Integer를 만나면 자동 Boxing
		// wrapper 클래스만 가능
		
		int r = n; // Unboxing (box를 벗김)
		
		long l = m; // 자동 형변환
		
		Object obj = 100; // Boxing + Upcasting
	}

}
