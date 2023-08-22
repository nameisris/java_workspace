package ex6;

public class Ex24 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));

	}

	static int abs(int value) {
		
		return value >= 0? value:-value; // (비교문의 참/거짓)?(참일 경우의 값):(거짓일 경우의 값);
	}
}
