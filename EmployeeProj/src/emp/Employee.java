package emp;

public class Employee {
	int id;
	String name;
	String dept;
	int sal;
	int bonus;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Employee() {
		
	}
	
	public Employee(int id, String name, String dept, int sal) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	
	public String info() {
		return String.format("사번: %d, 이름: %s, 부서: %s, 급여: %d", id, name, dept, sal);
	}
 	
	public void setBonus(int bonus) {
		this.bonus += bonus;
	}

}
