
public class WhileTest2 {

	public static void main(String[] args) {
		int dan, i = 1;
		
		while(i < 10) {
			dan = 2;
			
			while(dan < 10) {
				System.out.println(String.format("%d x %d = %2d\t", dan, i, dan * i));
				dan++;
			}
			System.out.println();
			i++;
		}

	}

}
