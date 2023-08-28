
public class InterfaceTest1 {

	public static void main(String[] args) {
		Fighter fighter = new Fighter(); // upcasting
		fighter.fight();
//		fighter.move(); // Fightable 타입으로 선언하였기에, 레퍼런스 타입인 Fightable에 없는 메서드인 fight는 호출 불가
		Fightable fighter1 = fighter;
		fighter1.fight();
		Unit unit = fighter;
		// Object obj = fighter;
		
		System.out.println();
		
		Helper helper = new Helper();
		Helping helping = helper;
		helping.help();
		Unit unit2 = helper;
		unit2.move();
		
		System.out.println();
		
		Comber comber = new Comber();
		Fightable fighter3 = comber;
		fighter3.fight();
		Helping helping2 = comber;
		helping2.help();
		Unit unit3 = comber;
		unit3.move();
		
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-");
		
		fightMethod(fighter);
		fightMethod(comber);
		
		System.out.println();
		
		helpMethod(helper);
		helpMethod(comber);
		
		System.out.println();
		
		moveMethod(fighter);
		moveMethod(helper);
		moveMethod(comber);
	}
	
	static void fightMethod(Fightable unit) {
		unit.fight();
	}
	
	static void helpMethod(Helping unit) {
		unit.help();
	}
	
	static void moveMethod(Unit unit) {
		unit.move();
	}

}

interface Fightable {
	void fight();
	
}

interface Helping {
	void help();
}

abstract class Unit {
	public void move() {
		
	}
}

class Fighter extends Unit implements Fightable {
	@Override
	public void fight() {
		System.out.println("Fighter fight");
	}
	
	@Override
	public void move() {
		System.out.println("Fighter move");
	}
}

class Helper extends Unit implements Helping {
	@Override
	public void help() {
		System.out.println("Helper help");
	}
	
	@Override
	public void move() {
		System.out.println("Helper move");
	}
}

class Comber extends Unit implements Fightable, Helping {
	@Override
	public void help() {
		System.out.println("Comber help");
	}
	
	@Override
	public void fight() {
		System.out.println("Comber fight");
	}
	
	@Override
	public void move() {
		System.out.println("Comber move");
	}
}