package com.test06.entity;

public class Coffee extends Drink {
	public int COFFEE_PRICE = 100;
	
	public Coffee() {
		super();
	}
	
	@Override
	public int getPrice() {
		return COFFEE_PRICE;
	}
	
	@Override
	public String toString() {
		return "커피";
	}
}
