package com.test06.entity;

public class Juice extends Drink {
	public int JUICE_PRICE = 200;
	
	public Juice() {
		super();
	}
	
	@Override
	public int getPrice() {
		return JUICE_PRICE;
	}
	
	@Override
	public String toString() {
		return "쥬스";
	}
}
