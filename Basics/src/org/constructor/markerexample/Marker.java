package org.constructor.markerexample;

public class Marker {

	String color;
	int price = 50;
	String brand = "Camlin";

	Marker(String color) {

		this.color = color;
	}

	void showDetails() {

		System.out.println(color + " " + price + " " + brand);

	}

	public static void main(String[] args) {

		Marker m1 = new Marker("Black");
		Marker m2 = new Marker("Green");
		
		m1.showDetails();

	}

}
