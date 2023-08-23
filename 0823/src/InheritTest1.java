
class Person {
	int age;
	String name;
	
	Person() {
		
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}

class Student extends Person {
	String major;
	int grade;
	
	Student() {
		
	}
	
	Student(String name, int age, String major, int grade) {
//		this.name = name;
//		this.age = age;
		this.major = major;
		this.grade= grade;
	}
	
	@Override // 부모의 메서드를 재정의
	String info() {
		return super.info() + ", 전공: " + major + ", 학년: " + grade;
	}
}

public class InheritTest1 {

	public static void main(String[] args) {
		Student std1 = new Student(); // 자식 객체를 통해 부모 클래스의 속성과 메서드를 사용할 수 있음
		std1.name = "김학생";
		std1.age = 20;
		std1.major = "컴퓨터공학";
		std1.grade = 1;
		System.out.println(std1.info());
		
		Student std2 = new Student("김덕배", 22, "경영학과", 3);
		
		Person per1 = new Person();
		per1.name = "김부모";
		per1.age = 40;
		// per1.major = "기계공학"; // 부모 객체는 자식에서만 선언된 속성과 메서드를 사용할 수 없음
		// per1.age = 4;
		
		System.out.println(per1.info());
	}

}
