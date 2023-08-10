
public class WhileTest1 {

	public static void main(String[] args) {
		int dan = 2;
		int i = 1;
		
		while(i < 10) {
			System.out.println(String.format("%d x %d = %2d", dan, i, dan * i));
			i++;
		}

	}

}
