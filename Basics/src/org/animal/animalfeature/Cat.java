package org.animal.animalfeature;

public class Cat {

	void eat(Fish f) {

		System.out.println("eats fish");
	}

	void eat(Rat r) {

		System.out.println("eats rat");
	}

	void eat(Cheese c) {

		System.out.println("eats cheese");

	}

	public static void main(String[] args) {

		Cat c = new Cat();

		Fish f = new Fish();

		Rat r = new Rat();

		Cheese ch = new Cheese();

		c.eat(f);
		c.eat(new Cheese());
	}
}
