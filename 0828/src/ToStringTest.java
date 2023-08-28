
public class ToStringTest {

	public static void main(String[] args) {
		Person p1 = new Person("hong", 30);
		Person p2 = new Person("hong", 30);

		// 문자열이 가는 곳에 객체를 호출하면
		// Override한 toString()을 출력
		System.out.println(p1); // toString() 출력
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false)
			return false;
		
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
}