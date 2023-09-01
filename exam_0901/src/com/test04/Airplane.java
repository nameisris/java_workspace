package com.test04;

public class Airplane extends Plane {
	public Airplane() {
		super();
	}
	
	public Airplane(String planName, int fuelSize) {
		super(planName, fuelSize);
	}
	
	@Override
	public void flight(int distance) { // 운항
		setFuelSize(getFuelSize() - (distance / 10) * 30);
	}
}
