package exc5;

public class Ex8 {

	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2}; // 11크기의 배열
		int[] counter = new int[4]; // counter[0], counter[1], counter[2], counter[3]
		
		for(int i = 0;i < answer.length;i++) { // 11번
			counter[answer[i] - 1]++;
		}
		
		for(int i = 0;i < counter.length;i++) {
			System.out.print(counter[i]);
			for(int j = 0;j < counter[i];j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
