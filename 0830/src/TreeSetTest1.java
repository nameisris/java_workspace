import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// Integer 타입으로 TreeSet 자료구조 형태의 프레임워크 ts 생성
		TreeSet<Integer> ts = new TreeSet<>();
		// Integer 값 add
		ts.add(100);
		ts.add(50);
		ts.add(30);
		ts.add(150);
		
		// TreeSet이므로, 오름차순 정렬
		System.out.println(ts);
		
		// Person 타입으로 TreeSet 자료구조 형태의 프레임워크 ts 생성
		// Comparator: 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때 사용
		// 원하는 기준으로 Override
		// 아래의 경우는, 나이를 기준으로 정렬
		TreeSet<Person> tsp = new TreeSet<>(new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.age > o2.age) {
					return 1;
				} else if(o1.age < o2.age) {
					return -1;
				} else {
					return 0;
				}
				
				// 아래와 같이 간단히 표현 가능
//				return o1.age - o2.age;
			}
		});
		
		tsp.add(new Person("hong", 20));
		tsp.add(new Person("song", 10));
		tsp.add(new Person("gong", 50));
		tsp.add(new Person("tong", 30));
		tsp.add(new Person("pong", 40));
		
		System.out.println(tsp);
		
		// 20 이상 60 미만까지를 반환
		SortedSet<Person> subList = tsp.subSet(new Person("", 20), new Person("",60));
		System.out.println(subList);
	}

}
