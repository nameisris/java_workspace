package item;

public class Unit {
	int healthPoint;		// 각 유닛들의 실시간 체력
	final int MAX_HP;	// 각 유닛들의 최대 체력
	// final 변수이기에, 상속받을 각 자식 클래스들에서 초기화 해주기 위해
	// 생성자로 초기화 (이후, 각 자식 클래스들에서 super()를 이용해 체력 변수를 초기화
	// 즉, 값이 고정된 final 변수를 부모 클래스에서 정해주는(초기화) 해주는 것이 아닌,
	// 자식 클래스에서 넘겨줘서 초기화 해주는 것
	
	Unit(int hp) {
		MAX_HP = hp;
		healthPoint = MAX_HP;
	}
}
