package ex6;

public class Ex20 {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(java.util.Arrays.toString(original));
		System.out.println("----------");

		int[] result = shuffle(original);
		
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(original == result);
		
		shuffle(original); // 셔플 메소드에서 새로운 배열에 original의 값을 복제하여 넣어주는 것이므로, orginal의 값은 동일
		// 만일 복제하는 것이 아니라면, 일반적인 변수와 달리 배열 변수는 변수 주소를 넘기는 것이기에 original의 값들이 셔플됨
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(java.util.Arrays.toString(original));
		
	}

	static int[] shuffle(int[] arr) {
		int[] mixarr = arr.clone();
		
		// int[] mixarr = new int[arr.length];
		// System.arraycopy(arr, 0, mixarr, 0, arr.length); // 원본, 원본 시작 인덱스, 사본, 사본 시작 인덱스, 복제 크기
		
		for(int i = 0;i < arr.length;i++) {
			int idx1 = (int) (Math.random() * arr.length);
			int idx2 = (int) (Math.random() * arr.length);
			int tmp = mixarr[idx1];
			mixarr[idx1] = mixarr[idx2];
			mixarr[idx2] = tmp;
		}
		 
		return mixarr;
	}
}
