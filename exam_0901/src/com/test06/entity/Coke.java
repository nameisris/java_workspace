package com.test06.entity;

public class Coke extends Drink {
	public int COKE_PRICE = 50;
	
	public Coke() {
		super();
	}
	
	@Override
	public int getPrice() {
		return COKE_PRICE;
	}

	@Override
	public String toString() {
		return "콜라";
	}
}
