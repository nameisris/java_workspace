
public class OperTest1 {

	public static void main(String[] args) {
		int n = 10;
		n++; // n = n + 1;
		System.out.println(n); // 11

		++n;
		System.out.println(n); // 12
		
		int m = 100;
		int res = ++m; // 연산의 결과값을 줌
		System.out.println(res); // 101
		res = m++; // 이전 값을 줌. (m의 값을 받는게 먼저고, m은 나중에 증가)
		System.out.println(res); // 101
		System.out.println(m); // 102
		
		int l = 1000;
		System.out.println(l++); // 1000
		System.out.println(++l); // 1002
		System.out.println(l); // 1001
		
		// l++는 이전 값을 줌
		// ++l는 더한 값을 줌
	}

}
