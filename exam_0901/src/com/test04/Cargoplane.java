package com.test04;

public class Cargoplane extends Plane {
	public Cargoplane() {
		super();
	}
	
	public Cargoplane(String planName, int fuelSize) {
		super(planName, fuelSize);
	}
	
	@Override
	public void flight(int distance) { // 운항
		setFuelSize(getFuelSize() - (distance / 10) * 50);
	}
}
