import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(4);
		list1.add(3);
		list1.add(5);
		list1.add(1);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		print(list1);
		print(list2);
		
		List<Integer> sublist = list1.subList(2, 4);
		print(sublist);
		
		// Collections에 포함된 메서드
		// 오름차순 정렬
		// 내부적으로 quick sort 사용
		Collections.sort(list1);
		print(list1);
		
		ArrayList<Person> list3 = new ArrayList<>();
		list3.add(new Person("hong", 30));
		list3.add(new Person("song", 20));
		list3.add(new Person("gong", 35));
		
		// sort의 기준에 맞는 값이 되어야 함
		// 숫자 타입이면 정렬이 되지만, Person은 그렇지 않기에
		// 사용하고 싶으면 Person 클래스에서 Comparable 인터페이스를 상속받아야 함
		Collections.sort(list3);
		print2(list3);
	}
	
	static void print(List<Integer> list) {
		for(Integer n : list) { // 향상된 for문
			System.out.print(n + ", ");
		}
		System.out.println();
	}
	
	static void print2(List<Person> list) {
		for(Person n : list) {
			System.out.println(n);
		}
		System.out.println();
	}
}
