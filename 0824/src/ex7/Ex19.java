package ex7;

public class Ex19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입할 제품을 저장하기 위한 배열
	int cnt = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(cnt >= cart.length) {
			Product[] tCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, tCart, 0, cart.length);
			cart = tCart;
		}
		cart[cnt++] = p;
	}
	
	void summary() {
		String list = "구입한 물건: ";
		int sum = 0;
		
		for(int i = 0;i < cnt;i++) {
			list += cart[i] + ", "; // cart[i] 대신 cart[i].toString() 호출하여도 동일
			sum += cart[i].price;
		}
		System.out.println(list);
		System.out.println("사용한 금액: " + sum);
		System.out.println("남은 금액: " + money);
	}
}

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}