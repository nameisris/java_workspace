package ex6;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));

	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		double result;
		
		result = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		// result = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
		return result;
	}

}

// 제곱 함수 Math.pow(제곱할 수, 제곱 승);
// 제곱근 함수 Math.sqrt(제곱근이 될 값);