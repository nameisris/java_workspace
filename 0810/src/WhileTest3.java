
public class WhileTest3 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		// 숫자 범위 반복문
		/*
		while(i < 11) {
			sum += i;
			i++;
		}

		System.out.println(sum);
		*/
		
		// 반복문 탈출
		while(true) {
			sum += i;
			
			if(sum >= 100)
				break;
			i++;
		}
		
		System.out.println(sum);
		System.out.println(i);
		
		for(int j = 0;;j++) {
			System.out.println(":d");
			break;
		}
		
		for(;;) {
			System.out.println("dd");
			break;
		}
	}

}
