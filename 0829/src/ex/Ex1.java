package ex;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof SutdaCard))
			return false;
		
		SutdaCard sc = (SutdaCard) obj;
		
		return num == sc.num && isKwang == sc.isKwang;
		
//		if(num == sc.num && isKwang == sc.isKwang) {
//			return true;
//		}
//		
//		return false;
	}
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}