package org.qspiders.calculatorapp;

public class GSTCalculator {
	
	void calculateGST(double productPrice){
		
		double gst = productPrice * 0.18;
		double totalCost =productPrice + gst;
		System.out.println("print gst  " +gst);
		System.out.println("print totalcost " +totalCost);
	}
	
	public static void main(String[] args){
		
		GSTCalculator g = new GSTCalculator();
		g.calculateGST(350);
	}

}
