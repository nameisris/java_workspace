package com.test05;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();
		Secretary sc = new Secretary("홍길동", 1, "Secretary", 800);
		Sales sl = new Sales("이순신", 2, "Sales", 1200);
		
		map.put(sc.getNumber(), sc);
		map.put(sl.getNumber(), sl);
		
		System.out.println("name     department     salary");
		System.out.println("------------------------------------------");
		for(Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		System.out.println();
		System.out.println();	
		System.out.println("인센티브100지급");
		sc.incentive(100);
		sl.incentive(100);
		System.out.println();
		System.out.println();

		System.out.println("name     department     salary     tax");
		System.out.println("------------------------------------------");
		for(Integer key : map.keySet()) {
			System.out.println(map.get(key) + "        " + String.format("%.2f", map.get(key).tax()));
			
		}
	}

}
