package org.qspiders.calculatorapp;

public class Convertor {
	
	double convertDegreeCelSiusToFeh(double cel){
		
		double feh = cel * 1.8 + 32;
		return feh;
	}
	
	double convertFehToDegreeCel(int feh){
		
		double cel = (feh - 32)/ 1.8;
		return cel;
	}

	
	public static void main(String[] args){
		
		Convertor c = new Convertor();
		System.out.println(c.convertDegreeCelSiusToFeh(4));
		System.out.println(c.convertFehToDegreeCel(43));
		
	}
	
}
