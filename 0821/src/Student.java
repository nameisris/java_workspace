
public class Student {
	// 인스턴스 변수 (instance variable)
	String name;
	String address;
	int grade;
	int num;
	
	// 메서드
	String info() {
		return String.format("이름: %s, 주소: %s, 학년: %d, 학번: %d", name, address, grade, num);
	}
	
}
