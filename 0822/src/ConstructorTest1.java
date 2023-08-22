
public class ConstructorTest1 {

	public static void main(String[] args) {
		Person per1 = new Person("홍길동", 20);
		
		per1.info(); // Person.info(per1);
		
		Person per2 = new Person();
		per2.name = "고길동";
		per2.age = 30;
		
		Person per3 = new Person("차길동");
		per3.age = 25;
		
		Person per4 = new Person(35);
		per4.name = "장길동";
		
		Person per5 = new Person(per1);
	}

}

class Person {
	String name;
	int age;
	
	// 기본 생성자
	// 없을 경우, 컴파일러에서 자동으로 추가
	// 반환자를 갖지 않음
	// void도 명시하지 않음
	Person() {
		// System.out.println("Person()");
		
		this("none", 0); // Person(String n , int a) 생성자 사용
		// 생성자에서 다른 생성자 호출, 반드시 생성자 맨 첫 줄에 호출해야 함
	}
	
	// private이기에 접근 불가
//	private Person() {
//		
//	}
	
	Person(String n , int a) {
		name = n;
		age = a;
	}
	
	Person(String n) {
		this(n, 0); // Person(String n, int a) 생성자 사용
//		name = n;
//		age = 0;
	}
	
	Person(int a) {
		this("none", a); // Person(String n , int a) 생성자 사용
//		age = a;
//		name = "none";
	}
	
	Person(Person p) {
		name = p.name;
		age = p.age;
	}
	
//	String info(Person this) {
//		return "이름: " + this.name + ", 나이: " + age;
//	}
	
	String info(Person this) {
		return "이름: " + this.name + ", 나이: " + age;
	}
	
}