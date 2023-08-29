import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "Good Luck";
		
		int idx0 = str.indexOf('L');
		int idx1 = str.indexOf('l');
		
		System.out.println(idx0);
		System.out.println(idx1);

		int idx2 = str.indexOf("Luck");
		System.out.println(idx2); // Luck에서 가장 앞인 L의 인덱스를 반환
		
		
		String str2 = "apple";
		int idx3 = str2.indexOf('p');		// 앞에서부터 찾음
		int idx4 = str2.lastIndexOf('p');	// 뒤에서부터 찾음
		System.out.println(idx3);
		System.out.println(idx4);
		String str3 = str2.replace('p', 't');
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str2.replace("apple", "banana");
		System.out.println(str4);
		
		String fruitStr = "apple, banana, pineapple, melon, strawberry";
		String[] fruitArr = fruitStr.split(", ");
		for(int i = 0;i < fruitArr.length;i++) {
			System.out.println(fruitArr[i]);
		}
		
		String pineapple = fruitStr.substring(15, 24);
		System.out.println(pineapple);
		
//		System.out.print("Y/N를 선택하세요: ");
//		Scanner sc = new Scanner(System.in);
//		
//		String answer = sc.nextLine();
//		if(answer.toLowerCase().equals("Y")) {
//			System.out.println("Yes 선택");
//		} else if(answer.toUpperCase().equals("N")) {
//			System.out.println("No 선택");
//		}
		
		
		String str5 = "  Hello World  ".trim();
		System.out.println(str5);
		
		Point p = new Point(10, 10);
		
		String str6 = String.valueOf(p);
		String str7 = "" + p;
		System.out.println(str6);
		System.out.println(str7);
	}

}
