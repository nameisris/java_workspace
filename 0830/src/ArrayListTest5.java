import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(10);list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		System.out.println(list1);	// [] 내부에 값 출력
		print(list1.toArray());		// print 메서드의 매개변수가 배열 형태이기에
		
		// 복제
		List list2 = (List) (list1.clone());
		list2.set(0, 100);
		
		System.out.println(list2);
	}
	
	static void print(Object[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
