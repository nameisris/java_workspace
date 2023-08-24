package ex7;

public class Ex1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
//		for(int i = 0;i < deck.cards.length;i++) {
//			System.out.print(deck.cards[i] + ", ");
//		}

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
		System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	// 기본 생성자
	SutdaDeck() {
		for(int i = 0;i < CARD_NUM / 2;i++) {
			if(i == 1 - 1 || i == 3 - 1 || i == 8 - 1) {
				cards[i % 10] = new SutdaCard(i % 10 + 1, true);
				cards[i % 10 + 10] = new SutdaCard(i % 10 + 1, false);
			} else {
				cards[i] = new SutdaCard(i % 10 + 1, false);
				cards[i + 10] = new SutdaCard(i % 10 + 1, false);
			}
		}
	}
	
	void shuffle() {
		for(int i = 0;i < 100;i++) {
			int idx1 = (int) (Math.random() * 20);
			int idx2 = (int) (Math.random() * 20);
			
			SutdaCard temp = cards[idx1];
			cards[idx1] = cards[idx2];
			cards[idx2] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		
		return cards[(int) (Math.random() * 20 + 1)];
	}
}

class SutdaCard {
	// 값이 한 번 적용되면 변경되어서는 안됨
	final int num;
	final boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩
	// toString()는 객체가 가진 정보나 값들을 문자열로 만들어 return하는 메서드
	// SutdaCard 타입으로 생성한 객체를 출력할 때, 반환할 String 타입의 문자열을 재정의
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}