package com.test04;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane ap = new Airplane("L777", 1000);
		Cargoplane cp = new Cargoplane("C50", 1000);

		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(ap.getPlaneName() + " " + ap.getFuelSize());
		System.out.println(cp.getPlaneName() + " " + cp.getFuelSize());
		
		System.out.println("100 운항");
		System.out.println();
		ap.flight(100);
		cp.flight(100);
		
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(ap.getPlaneName() + " " + ap.getFuelSize());
		System.out.println(cp.getPlaneName() + " " + cp.getFuelSize());
		
		System.out.println("200 주유");
		System.out.println();
		ap.refuel(200);
		cp.refuel(200);
		
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(ap.getPlaneName() + " " + ap.getFuelSize());
		System.out.println(cp.getPlaneName() + " " + cp.getFuelSize());
	}

}
