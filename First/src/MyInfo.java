
public class MyInfo {

	public static void main(String[] args) {
		// 이름을 저장할 변수 선언하여 본인 이름 할당
		String name = "류인수";
		
		// 나이를 저장할 변수 선언하여 본인 나이 할당
		int age = 26;
		
		// 키를 저장할 변수 선언하여 본인 키 소수점까지 할당
		double height = 173.5f;
		
		// 남여 구분을 저장할 변수를 선언하여 본인 성별 할당 'F' or 'M'
		char gender = 'M';
		
		// println 기본 줄바꿈
		System.out.println(String.format("%s, %d, %f, %c", name, age, height, gender));
		
		// %n 줄바꿈
		System.out.printf("%s, %d, %f, %c %n", name, age, height, gender);
		
		// 지시자 없이 변수명만으로 출력
		System.out.println("이름: " + name + ", 나이: " + age + ", 키: " + height + ", 성별: " + gender);

	}

}
