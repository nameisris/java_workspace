package ex7;

public class Ex7 {

	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("x: " + c.getX());
		// Child 객체를 생성할 때
		// Child의 기본 생성자에서
		// super()를 호출하므로,
		// 부모 클래스만 있는 getX() 시,
		// 부모 객체의 x값인 200을 출력하는 것
		

	}

}

class Parent {
	int x = 10;
	
	Parent() {
		this(200);
	}
	
	Parent(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x= 3000;
	
	Child() {
		// super();
		this(1000);
	}
	
	Child(int x) {
		this.x = x;
	}
}