package ex6;

public class Ex3_4_5 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}

}

class Student {
	String name; // 학생 이름
	int ban; // 반
	int no; // 번호
	int kor, eng, math; // 국영수
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f", name, ban, no, kor, eng, math, kor + eng + math, (float) (kor + eng + math) / 3);
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		float avg = (float) getTotal() / 3;
		// 75.545 => 76
		// 75.545 * 10 => 755.45 => 755(round) / 10.0 => 75.5
		avg = Math.round(avg * 10) / 10.0f; // 클래스명.메소드명 => 클래스 메소드 (static)
		return avg;
	}
}

