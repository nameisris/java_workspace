
class TempClass {
	final int x;
	
	static final int sx = 100;
	
	TempClass(int x) {
		this.x = x;
	}
	
	void method(int x) {
		// this.x = x;
	}
}

public class FinalTest1 {

	public static void main(String[] args) {
		final int n;
		n = 10;
		// n = 20; // final 변수이므로, 첫 초기화만 유효
		
		System.out.println(n);
		
		new TempClass(20);
		new TempClass(30);
	}

}
