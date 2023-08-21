class MyMath {
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
}

public class MethodTest1 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		int res = mm.add(10, 20);
		
		System.out.println(res);
	}

}
