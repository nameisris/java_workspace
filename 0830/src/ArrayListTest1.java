import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(100); // parsing
		// Object 타입이므로, 기본형인 int가 아니라 객체 취급인 Integer
		int n = (Integer) al.get(0);
		
		Integer in = 200;
		int in2 = in;
		
		ArrayList al2 = new ArrayList();
		al2.add(new Person());			// upcasting
		Person p = (Person) al2.get(0); // downcasting
		
		// ArrayList의 타입을 Object가 아닌 Person 클래스로 지정
		ArrayList<Person> p2 = new ArrayList<>();
	}

}

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person() {
		
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "(" + name + ", " + age + ")";
	}
	
	@Override
	public int compareTo(Person o) {
//		return age - o.age; // age와 o.age를 비교 (양수, 음수, 0 여부 return)
		return name.compareTo(o.name); // compare 자체에 있는 String 비교 사용
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false)
			return false;
		
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}