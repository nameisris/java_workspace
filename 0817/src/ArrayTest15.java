import java.util.Scanner;

/*
입력 데이터 수: 5
95
100
85
77
60
출력
최소값: 60
최대값: 100
*/
public class ArrayTest15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 데이터 수: ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0], min = arr[0];
		
		for(int i = 1;i < arr.length;i++) {
			if(max < arr[i])
				max = arr[i];
			else if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println("출력");
	    System.out.println("최소값: " + min);
	    System.out.println("최대값: " + max);
	}

}
