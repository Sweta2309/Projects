package org.qspiders.calculatorapp;

public class calculator1 {
	
	int add(int num1 , int num2){
		
		int result = num1 + num2;
		return result;
		
	}
	
	int add(int num1 , int num2 , int num3){
		
		int result = num1 + num2 + num3;
		return result;
	}
	
	int add(int num1 , int num2 , int num3 , int num4){
		
		int result = num1 + num2 + num3 + num4;
		return result;
	}
	
	public static void main(String[] args){
		
		calculator1 c = new calculator1();
		System.out.println(c.add(45, 35));
		System.out.println(c.add(10, 22, 33));
		System.out.println(c.add(34, 23, 87, 67));
		
	}

}
