package org.qspiders.calculatorapp;

public class Hello {

	void greet(){
		
		System.out.println("Hello");
	}
	
	void greet(String name){
		
		System.out.println("Hello " +name);
	}
	
	public static void main(String[] args){
		
		Hello h = new Hello();
		h.greet();
		h.greet("Ricky");
	}
}
