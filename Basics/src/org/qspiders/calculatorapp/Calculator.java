package org.qspiders.calculatorapp;

public class Calculator {
	
	int add(int num1,int num2){
		
		int res = num1 + num2;
		return res;
	}
	
	int mul(int num1, int num2){
		
		int res = num1 * num2;
		return res;
	}

	int div(int num1 , int num2){
		
		int res = num1/num2;
		return res;
	}
	
	int convertHourToMinute(int hour){
		
		int minute = hour * 60;
		return minute;
		
		
	}
	
	int sub(int num1 , int num2){
		
		int res = num1 - num2;
		return res;
	}
	
	int square(int num){
		
		int res = num * num;
		return res;
		
	}
	
	int cube(int num){
		
		int res = num * num *num;
		return res;
	}
	

}
