
public class Employee {
	int id;
	String name;
	String dep;
	int salary;
	
	Employee() {
		
	}
	
	Employee(int id, String name, String dep, int salary) {
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
	
	String info() {
		return String.format("사번: %d, 이름: %s, 부서: %s, 급여: %d", id, name, dep, salary);
	}
 	
	int setBonus(int bonus) {
		salary += bonus;
		return salary;
	}

}
