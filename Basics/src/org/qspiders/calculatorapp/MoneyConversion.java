package org.qspiders.calculatorapp;

public class MoneyConversion {
	
	void convertRupeesToUSD(double rupees){
		
		double USD = rupees / 64.8;
		double comm = USD * 0.03;
		double totalValue = USD - comm;
		System.out.println("total conversion value is  " +USD);
		System.out.println("total commision is  "+comm);
		System.out.println("totalValue is  " + totalValue);
	}
	
	public static void main(String[] args){
		
		MoneyConversion m = new MoneyConversion();
		m.convertRupeesToUSD(2000);
		
	}

}
