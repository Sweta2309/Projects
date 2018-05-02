package com.benz.carmanufacture;

public class Car {

	Smoke fill(Petrol p) {
		
		System.out.println("Accepting Petrol");
		System.out.println("generating smoke");
		Smoke s = new Smoke();
		System.out.println("return smoke");
		return s;

	}

	Smoke fill(Diesel d) {

		Smoke s = new Smoke();
		return s;

	}

	Smoke fill(Gasoline g) {

		Smoke s = new Smoke();
		return s;
	}

	public static void main(String[] args) {

		System.out.println("creating car object");
		Car c = new Car();
		System.out.println("creating petrol object");
		Petrol p = new Petrol();
		Diesel d = new Diesel();
		Gasoline g = new Gasoline();
		System.out.println("filling the car with petrol");
		Smoke s = c.fill(p);
		
	}

}
