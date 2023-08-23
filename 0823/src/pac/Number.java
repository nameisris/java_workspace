package pac;

public class Number {

	private int pnum;
	
	private void pmethod() {
		pnum = 10;
	}
	
	int dnum; // default
	
	// default 멤버인 dnum을 public 메서드를 통해 반환받을 수 있음
	public int getDnum() {
		return dnum;
	}
	
	public void setDnum(int data) {
		dnum = data;
	}
	
	public void dmethod() { // default
		System.out.println(pnum);
	}			
	
	public int punum;
	public void pumethod() {
		System.out.println(pnum);
	}
	
	protected int prnum;
	public void prmethod() {
		
	}

}
