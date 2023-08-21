package ex6;

class SutdaCard {
	int num;
	boolean isKwang = true;
	
	String info() {
		return num + (isKwang? "K" : "");
	}
}

public class Ex1_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		card1.num = 3;
		card1.isKwang = false;
		SutdaCard card2 = new SutdaCard();
		card2.num = 1;
		card2.isKwang = true;
		
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}
