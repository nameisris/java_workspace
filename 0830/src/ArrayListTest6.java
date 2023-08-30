import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest6 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
	
		// 람다식
		// -> 의 값이 true인 것만 삭제
		// 아래의 경우는 3의 배수
		// Java 8 부터 해당 기능 추가
		numbers.removeIf(n -> (n % 3) == 0);
		
		System.out.println(numbers);
	}
}
