import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class CompanyMain {

	
	public static void main(String[] args) {
		Company com = new Company();
		
		Permanent emp1 = new Permanent(1001, "상부상조", 5000000);
		Sales emp2 = new Sales(1002, "자바조", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "커피조", 160, 30000);
		
		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		
//		com.regBusinessTrip(emp1, 1); // error, Permanent 출장 불가능
		com.regBusinessTrip(emp2, 2); // Sales 출장 가능, 하루당 300000원을 incentive로 지급
		com.regBusinessTrip(emp3, 1
				); // PartTime 출장 가능, (출장 시간 * payPerime)원을 incentive로 지급 (출장시간은 1일당 24시간)
		
		com.allEmployeeInfo();
		
		System.out.println("총 급여액: " + com.getTotalPay());
	}

//	5000000
//	5600000
//	5520000
//	
//	1612000
}
