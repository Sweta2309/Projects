package com.coffeeday.vendingproject;

public class VendingMachine {

	CoffeeBean prepare(Coffee c) {

		System.out.println("CoffeeBeans are accepted");
		CoffeeBean cb = new CoffeeBean();
		System.out.println("Coffee is prepared");
		return cb;
	}

	Apple prepare(AppleJuice ap) {

		System.out.println("Apple is accepted");
		Apple a = new Apple();
		System.out.println("Apple Juice is prepared");
		return a;
	}

	Water prepare(ColdWater cd) {

		System.out.println("Water is accepted");
		Water w = new Water();
		System.out.println("Cold water is prepared");
		return w;
	}

	public static void main(String[] args) {

		VendingMachine vm = new VendingMachine();

		Coffee c = new Coffee();
		CoffeeBean cm = vm.prepare(c);

		AppleJuice ap = new AppleJuice();
		Apple a = vm.prepare(ap);

		ColdWater cd = new ColdWater();
		Water w = vm.prepare(cd);

		System.out.println("All things are prepared");
	}
}
