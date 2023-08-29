package ex;

public class Ex8 {
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
	
	public static double round(double d, int n) {
//		return Math.round(d * Math.pow(10, n)) / (double) Math.pow(10, n);
		// Math.round(3.1415 * 10 ^ n) / (double) 10 ^ n
		// 한 번 곱해주고, 곱해준 만큼 double 형으로 나눠줌
		double p = Math.pow(10, n);
		
		return Math.round(d * p) / p;
	}
}

// 3.1
// 3.14
// 3.141
// 3.1415
// 3.1415