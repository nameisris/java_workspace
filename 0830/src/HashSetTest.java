import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(234);
		hs.add(14);
		hs.add(45);
		hs.add(8);
		hs.add(11);
		hs.add(45);
		
		for(Integer n : hs) {
			System.out.println(n);
		}
		
		HashSet<Person> ahs = new HashSet<>();
		
		ahs.add(new Person("홍길동", 23));
		ahs.add(new Person("고길동", 30));
		ahs.add(new Person("김길동", 33));
		ahs.add(new Person("박길동", 40));
		ahs.add(new Person("최길동", 33));
		
		for(Person p : ahs) {
			System.out.println(p);
		}
	}

}
