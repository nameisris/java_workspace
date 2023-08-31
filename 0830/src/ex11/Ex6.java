package ex11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex6 {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
			
				// getAverage()의 값이 float형이라 casting을 해주어야 하므로, 각 값의 차이가 0.01면 1을 return하기에, 오차가 발생 할 수 있으므로 해당 방법 사용 X
//				if(o1.getAverage() > o2.getAverage()) {
//					return 1;
//				} else if(o1.getAverage() < o2.getAverage()) {
//					return -1;
//				} else {
//					return 0;
//				}
				
//				return (int) (o1.getAverage() - o2.getAverage());
				
				// 평균의 차이는 오차 발생 가능성이 있기에, 합의 차이로 계산
				return o1.getTotal() - o2.getTotal();
			}
		});
		
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));
		
		// Iterator: 컬렉션 프레임워크에서 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
		// 컬렉션 프레임워크에서 값을 가져오거나 삭제할 때 사용
		// Iterator의 내부 메서드로 값을 가져오거나 삭제
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext()) {
			// 만약 가져올 값이 있다면 true 반환
			System.out.println(it.next()); // 만약 가져올 값이 있다면 
		}
		
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}

	static int getGroupCount(TreeSet tset, int from, int to) {
		// 국영수 값을 전부 from과 to로 하여, 평균도 from ~ to가 되도록
		SortedSet<Student> ss = tset.subSet(new Student("", 0, 0, from, from, from), new Student("", 0, 0, to, to, to));
		
		// from에서 to 사이의 값만이 들어간 ss의 size를 반환
		return ss.size();
//		Iterator<Student> it = tset.iterator();
//		int cnt = 0;
//		
//		while(it.hasNext()) {
//			double d = it.next().getAverage();
//			if(d >= from && d < to) {
//				cnt++;
//			}
//		}
//		return cnt;
	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
	}

	@Override
	public int compareTo(Student o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
}
