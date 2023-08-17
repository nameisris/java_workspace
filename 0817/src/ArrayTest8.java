
public class ArrayTest8 {

	public static void main(String[] args) {
		int n = 10;
		int m = n;
		
		int[] narr1 = {1, 2, 3, 4};
		int[] narr2 = new int[4];
		System.arraycopy(narr1, 0, narr2, 0, narr1.length); // deep copy
		// int[] narr2 = narr1; // narr2에게 narr2의 주소값을 줌 (같은 주소를 가리킴)
		narr2[0] = 100;
		
		for(int i = 0;i < narr1.length;i++) {
			System.out.print(narr1[i] + ", ");
		}
		System.out.println();
		for(int i = 0;i < narr2.length;i++) {
			System.out.print(narr2[i] + ", ");
		}

		// narr2의 특정 인덱스의 값을 초기화할 경우
		// narr2가 narr1과 같은 주소를 가리키므로, narr1과 narr2가 같은 출력 결과를 가짐
		
		// 동일한 주소값을 가리키는 배열이 아닌, 인덱스 값이 동일한 배열을 복사하고 싶으면 System.arraycopy() 메소드 사용
	}

}
