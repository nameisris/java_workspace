import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class CompanyMain {

	
	public static void main(String[] args) {
		Company com = new Company();
		
		Permanent emp1 = new Permanent(1001, "상부상조", 5000000);
		Sales emp2 = new Sales(1002, "자바조", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "커피조", 160, 300000);
		
		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		
		com.allEmployeeInfo();
		
		System.out.println("총 급여액: " + com.getTotalPay());
	}

}
