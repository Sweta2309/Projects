package com.bigbazar.apparelexample;

public class Apparel {

	String type;
	String color;
	char size;

	Apparel(String type, String color, char size) {

		this.type = type;
		this.color = color;
		this.size = size;

	}

	public Apparel(String type, char size) {
		this.type = type;
		this.size = size;
	}

	void showDetail() {

		System.out.println(this.type + " " + this.color + " " + this.size);
	}

	public static void main(String[] args) {

		Apparel a = new Apparel("jean", "blue", 'M');
		a.showDetail();
	}

}
