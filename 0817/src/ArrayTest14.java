import java.util.Scanner;

/*
입력 데이터 수: 5
95
100
85
77
60
출력
60 77 85 95 100 
*/
public class ArrayTest14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 데이터 수: ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		// 버블 정렬 (Bubble Sort)
		// 서로 인접한 두 원소를 비교하여 교환
		// swap
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				int temp;
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		

		
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
