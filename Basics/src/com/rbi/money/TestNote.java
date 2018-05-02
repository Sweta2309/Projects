package com.rbi.money;

public class TestNote {

	public static void main(String[] args) {

		Note n1 = new Note();
		Note n2 = new Note();
		Note n3 = new Note();

		n1.color = "blue";
		n1.value = 50;
		n1.length = 5.3;

		System.out.println(n1.color + "  " + n1.value + "   " + n1.length);

		n2.color = "green";
		n2.value = 200;
		n2.length = 5.7;

		System.out.println(n2.color + " " + n2.value + "  " + n2.length);

		n3.color = "pink";
		n3.value = 2000;
		n3.length = 6.5;

		System.out.println(n3.color + "  " + n3.value + " " + n3.length);
	}

}
