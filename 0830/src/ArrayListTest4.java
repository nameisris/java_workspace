import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
	
		List<Integer> list2 = list1.subList(1, 4);
		print(list1);
		print(list2);
		
		System.out.println(list1.containsAll(list2));
		System.out.println("====================");
	
		// list1에서 list2와 동일한 부분을 제외하고 전부 삭제
		list1.retainAll(list2);
		print(list1);
		
		System.out.println("====================");
		// 0번째에 6 삽입
		list1.add(0, 6);
		print(list1);
		
		System.out.println("====================");
		// 0번째를 7로 변경
		list1.set(0, 7);
		print(list1);
		
		System.out.println("====================");
		list1.add(7);
		print(list1);
		
		System.out.println("====================");
		// 맨 앞의 7만 삭제 (맨 뒤의 7은 삭제되지 않음)
		list1.remove(new Integer(7));
		print(list1);
	}
	
	static void print(List<Integer> list) {
		for(Integer n: list) {
			System.out.print(n + ", ");
		}
		System.out.println();
	}
}
