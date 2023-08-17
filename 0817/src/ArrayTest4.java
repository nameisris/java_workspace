
public class ArrayTest4 {

	public static void main(String[] args) {
		String hex = "13A0C";
		String[] binary = new String[] {
				"0000", "0001", "0010", "0011", // 0, 1, 2, 3
				"0100", "0101", "0110", "0111", // 4, 5, 6, 7
				"1000", "1001", "1010", "1011", // 8, 9, A, B
				"1100", "1101", "1110", "1111", // C, D, E, F 
		};
		
		String result = "";
		
		for(int i = 0;i < hex.length();i++) {
			if(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
				result += binary[hex.charAt(i) - '0'];
			} else { // hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F'
				result += binary[10 + hex.charAt(i) - 'A'];
			}
		}
		System.out.println("hex: " + hex);
		System.out.println("binary: " + result);
	}

}
// 출력 결과
// hex: 13A0C
// binary: 00010011101000001100
