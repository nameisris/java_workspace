package acc;

public class SpecialAccount extends Account {

	private String grade = "Normal";
	private double interest = 0.01;

	public SpecialAccount() {
		super();
	}
	
	public SpecialAccount(String id, String name, String grade, int money) {
		super(id, name, money);
		setGrade(grade);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		switch(grade) {
		case "V":
		case "v":
			this.grade = "VIP";
			interest = 0.04;
			break;
		case "G":
		case "g":
			this.grade = "Gold";
			interest = 0.03;
			break;
		case "S":
		case "s":
			this.grade = "Silver";
			interest = 0.02;
			break;
		case "N":
		case "n":
			this.grade = "Normal";
			interest = 0.01;
		}
	}
	
	@Override
	public String info() {
		return String.format("고객번호: %s, 이름: %s, 등급: %s, 잔액: %d", super.getId(), super.getName(), grade, super.getBalance());
	}
	
	@Override
	public void deposit(int money) {
		super.deposit((int) (Math.round(money + money * interest))); // Math.round(): 반올림
	}

}
