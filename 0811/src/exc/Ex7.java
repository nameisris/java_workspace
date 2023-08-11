package exc;

public class Ex7 {

	public static void main(String[] args) {
		// Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드
		
		int value = (int) (Math.random() * 6) + 1;
		
		System.out.println("value: " + value);
	}

}
