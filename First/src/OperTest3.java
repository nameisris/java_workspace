
public class OperTest3 {

	public static void main(String[] args) {
		// 나머지 없이 정수만 출력
		System.out.println(10 / 4); // 2
		
		// 소수점 출력
		System.out.println(10.0 / 4); // 2.5
		
		// 소수점
		int kor = 99, eng = 88, math = 100;
		int tot = kor + eng + math;
		double avg = tot / 3.0; // 3으로 하면 avg의 값이 95.0이 됨
		System.out.println("총점: " + tot + "\n평균: " + avg); // 95.6666666666...

		// 나머지값
		int mod = 10 % 4;
		System.out.println(mod); // 2
		
		// int보다 작은 타입들의 연산의 형
		byte a = 10;
		byte b = 20;
		// byte + byte = int로 변환 (int보다 작은 타입은 int로 형변환)
		// byte c = a + b;
		byte c = (byte) (a + b);
		
		// 오버플로우
		int i1 = 100000;
		int i2 = 200000;
		long res1 = i1 * i2; // int * int 는 자동으로 int로
		System.out.println(res1); // -1474836480 (오버플로우)
		
		long res2 = i1 * (long) i2;
		System.out.println(res2); // 20000000000
		
		long i3 = 100000 * 100000L;
		System.out.println(i3); // 10000000000
		
		int i4 = 100000 * 100000 / 100000; // * 연산자에서 오버플로우 발생 후 / 연산
		System.out.println(i4); // 14100
		
		int i5 = 100000 / 100000 * 100000;
		System.out.println(i5); // 100000
	}

}
