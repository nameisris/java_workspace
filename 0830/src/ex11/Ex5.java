package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex5 {

	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		
		list.add(new Human("홍길동", "000123", 24, "서울시 금천구"));
		list.add(new Human("남궁성", "931216", 31, "경기도 광명시"));
		list.add(new Human("김자바", "880505", 36, "서울시 강서구"));
		list.add(new Human("이자바", "991101", 25, "경기도 과천시"));
		list.add(new Human("안자바", "021213", 22, "서울시 송파구"));
		
		Collections.sort(list);
		
		Iterator<Human> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}


class Human implements Comparable<Human> {
	String name;
	String id;
	int age;
	String address;
	
	Human(String name, String id, int age, String address) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s, 주민번호: %s, 나이: %d, 주소: %s", name, id, age, address);
	}

	@Override
	public int compareTo(Human o) {
		int ret = name.compareTo(o.name);
		
		// 이름이 같을 경우
		if(ret == 0) {
			// 주민번호 순으로 정렬
			ret = id.compareTo(o.id);
		}
		
		return id.compareTo(o.id);
	}
	
}
