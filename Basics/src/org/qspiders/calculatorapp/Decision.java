package org.qspiders.calculatorapp;

public class Decision {

	String genderDecison(int number) {

		if (number == 1)

			return "Boy";

		else if (number == 2)

			return "Girl";

		else if (number == 3)

			return ("Nill");

		else
			return ("Null");
	}

	public static void main(String[] args) {

		Decision d = new Decision();

		System.out.println((d.genderDecison(1)));
	}
}
