class AA {
	int a;
	
	void methodA() { // 1
		
	}
	
	void method() { // 2
		
	}
	
	void info() {
		System.out.println(getPay());
	}
	
	int getPay() {
		return 0;
	}
}

class BB extends AA {
	int b;
	
	void methodB() { // 2
		
	}
	
	void method() { // 4
		
	}
	
	@Override
	int getPay() {
		return 100;
	}
}

public class PolimoTest2 {
	
	public static void main(String[] args) {
		AA obj = new BB();
		
		obj.methodA(); // 1
		
//		obj.methodB(); // 부모 타입에 없는 자식 메서드는 호출 불가
//		obj.b = 20; // 부모 타입에 없는 자식 변수는 접근 불가
		
		obj.method(); // 4
		obj.a = 10;
		
		obj.info(); // 자식 타입에는 없는 부모 타입의 info() 메서드를 호출하면서, info()에서 호출된 getPay()는 자식 타입에서 오버라이드 된 getPay()를 호출
		// 즉, 부모와 자식 타입에 동일한 메서드가 있을 경우, 오버라이드 된 자식 타입에서의 메서드를 우선
	}
	
	// 자식 객체를 부모 타입의 변수에 넣을 경우, 부모에는 없는 자식의 변수나 함수는 사용 불가
	// 단, 오버라이드 한 함수는 부모 변수로 자식의 함수를 호출 가능
}
