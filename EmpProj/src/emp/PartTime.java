package emp;

public class PartTime extends Employee implements BusinessAble {
	private int time;
	private int payPerTime;
	
	private int incentive;
	
	public PartTime() {
		
	}
	
	public PartTime(int id, String name, int time, int payPerTime) {
		super(id, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	
	@Override
	public int getPay() {
		return getTime() * getPayPerTime();
	}

	@Override
	public String info() {
		return super.info() + getPay() + ", 근무 시간: " + getTime() + ", 시급: " + getPayPerTime() + ", 인센티브: " + incentive;
	}
	
	@Override
	public void goBusiness(int day) {
		incentive = day * 24 * getPayPerTime();
		setTime(getTime() + day * 24);
	}
}
