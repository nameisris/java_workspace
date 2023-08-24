
public class PolimoTest3 {

	public static void main(String[] args) {
		Base base1 = new Derived(); // upcasting
		// 부모 레퍼런스 변수로 자식 객체 참조
		
		base1.method(); // 다형성
		base1.x = 10;
		// base1.y = 20; 불가능
		
		Base base2 = new Base();
		base2.method();
		
		// True
		if(base1 instanceof Derived) { // base1이 Derived 클래스의 인스턴스인가?
			Derived derived1 = (Derived) base1; // downcasting
			derived1.y = 20;
		}

		// False
		if(base2 instanceof Derived) { // base2가 Derived 클래스의 인스턴스인가?
			Derived derived2 = (Derived) base2;
			derived2.y = 30;
		}
		
		Base base3 = new Derived();
		base3.method(); // Drived method 출력 (참조 변수에 맞는 메소드 실행)
		System.out.println(base3.x); // 1 출력 (실제 인스턴스의 변수를 출력)
	}

}

class Base {
	int x = 1;
	
	void method() {
		System.out.println("Base method");
	}
}

class Derived extends Base {
	int x = 2;
	int y = 3;
	
	@Override
	void method() {
		System.out.println("Derived method");
	}
}