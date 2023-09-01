package com.test02;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("홍길동", 20, 177, 74, "201301", "체육");
		Student s2 = new Student("이순신", 44, 178, 77, "201302", "체육");
		Student s3 = new Student("유관순", 18, 155, 45, "201203", "컴퓨터");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
