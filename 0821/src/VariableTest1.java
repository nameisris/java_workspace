class MyClass {
	int num;
	static int snum;
	
	void setNum(int n) {
		
	}
}

public class VariableTest1 {

	public static void main(String[] args) {
		int n;
		
		// 객체 생성의 경우, 인스턴스 변수들이 자동으로 초기화 (0 or null 등)
		MyClass mc = new MyClass();
		
		// System.out.println(n); // 초기화하지 않고 사용 시 에러
		System.out.println(mc.num); // 초기화하지 않고 사용 가능
	}

}
