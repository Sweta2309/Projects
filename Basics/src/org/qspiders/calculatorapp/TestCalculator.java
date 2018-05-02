package org.qspiders.calculatorapp;

public class TestCalculator {
	
	public static void main(String[] args){
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(25, 35));
		System.out.println(c.mul(30, 64));
		System.out.println(c.div(100,2));
		System.out.println(c.sub(56, 34));
		System.out.println(c.square(65));
		System.out.println(c.cube(35));
		System.out.println(c.convertHourToMinute(3));
		
	}

}
