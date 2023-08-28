package emp;

public class Sales extends Permanent implements BusinessAble {
	private int incentive;
	
	public Sales() {
		
	}
	
	public Sales(int id, String name, int sal, int incentive) {
		super(id, name, sal);
		this.incentive = incentive;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return super.getPay() + incentive;
	}
	
	@Override
	public String info() {
		return super.info() + ", 인센티브: " + getIncentive();
	}
	
	@Override
	public void goBusiness(int day) {
		incentive += day * 300000;
	}
}
