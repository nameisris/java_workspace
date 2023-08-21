
// 하나의 java 파일에는 public이 하나만 있어야 함
public class ClassTest1 {

	public static void main(String[] args) {
		Student stu1 = new Student(); // stu1에 주소를 줌 (ex: 0x100)
		// 해당 인스턴스의 인스턴스 변수들의 값은 0 or null 등으로 선언과 동시에 초기화
		Student stu2 = stu1; // 주소값이 같아지므로, 같은 값 취급
		
		stu1.name = "홍길동";
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;
		
		System.out.println(stu2.name); // 홍길동 출력
		System.out.println(stu1.info());
	}

}
