
public class OperTest1 {

	public static void main(String[] args) {
		int x = 30, y = 20;
		int max = (x > y) ? x : y;
		
		System.out.println(max); // 30
		
		int i = 10;
		i *= 3 + 5; // i = i * (3 + 5) = 80 (대입 연산자의 우선순위 낮음)
		// i *= 3 <==> i = i * 3
	}

}
