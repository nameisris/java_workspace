class Person {
	String name;
	int age;
	
	Person() {
		
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String info() {
		return "이름: " + name+ ", 나이: " + age;
	}
}

public class ClassTest2 {

	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "홍길동";
		per1.age = 25;
		
		Person per2 = new Person("류인수", 26);
		
		System.out.println(per1.info());
		System.out.println(per2.info());
		
		// 객체가 아닌, 레퍼런스 5개를 생성
		// 개당 4바이트 짜리6
		Person[] parr = new Person[5];
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person();
	}

}
