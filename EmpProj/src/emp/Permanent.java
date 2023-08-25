package emp;

public class Permanent extends Employee {
	
	private int sal;
	
	public Permanent() {

	}
	
	public Permanent(int id, String name, int sal) {
		super(id, name);
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	@Override
	public int getPay() {
		return getSal();
	}
	
	@Override
	public String info() {
		return super.info() + getPay();
	}
}
