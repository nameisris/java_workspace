package ex;

public class Ex11 {

	public static void main(String[] args) {
		int s = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[args.length - 1]);
		
		if(args.length < 2) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		if(s < 2 || e > 9) {
			System.out.println("단의 범위는 2와 9 사이의 값이어야 합니다.");
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		// 앞에가 뒤에보다 크면 swap
		if(s > e) {
			int t = s;
			s = e;
			e = t;
		}
		 
		for(int i = s;i < e + 1;i++) {
			for(int j = 1;j < 10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	

	}

}
