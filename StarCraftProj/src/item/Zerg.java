package item;

public class Zerg extends AirUnit implements Repairable {
	public Zerg() {
		super(200);
	}

	@Override
	public void fix() {
		healthPoint = (int) Math.round(MAX_HP * 0.7);
		System.out.println("zerg fix");
	}
}
