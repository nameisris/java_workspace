
public class PolimoTest4 {

	public static void main(String[] args) {
		FireEngine fe1 = new FireEngine();
		fe1.water();
		
		Car car = fe1; // upcasting (자동 형변환)
		
		// 만일 car 참조 변수가 가리키는 인스턴스 타입이 FireEngine이라면
		if(car instanceof FireEngine) { // 참
 			FireEngine fe2 = (FireEngine) car; // downcasting (형변환 필수)
			fe2.water();	
		}
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Water splash!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("piyong piyong");
	}
}