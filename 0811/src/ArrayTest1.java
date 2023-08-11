
public class ArrayTest1 {

	public static void main(String[] args) {
		// narr1의 경우, 주소값을 가지는 레퍼런스
		// 실제 값은 narr1[i]에 각 인덱스에 해당하는 값을 초기화하여 가지게 됨
		// 배열의 각 요소는 0으로 자동 초기화
		int[] narr1 = new int[5];
		double[] darr1 = new double[5];
		
		int[] narr2; // 선언 
		narr2 = new int[10]; // 초기화
		
		narr1[0] = 1;
		narr1[1] = 2;
		narr1[2] = 3;
		narr1[3] = 4;
		narr1[4] = 5;
		
		int sum = 0;
		for(int i = 0;i < narr1.length;i++) {
			sum += narr1[i];
		}
		
		System.out.println(sum);
	}

}
