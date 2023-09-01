package com.test05;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() { // 세금
		return getSalary() * 0.10;
	}
	
	@Override
	public void incentive(int pay) { // 인센티브 지급
		setSalary((int) (getSalary() + (pay * 0.8)));
	}
}
