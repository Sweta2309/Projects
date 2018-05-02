package com.cello.bottlemanufacture;

public class Bottle {
	
void store(Water w){
	
	System.out.println("Water is stored");
		
	}
	
	void store(Milk m){
		
		System.out.println("Milk is stored");
		
	}
	
	void store(Juice j){
		
		System.out.println("Juice is stored");
	}
	
	public static void main(String[] args){
		
		Bottle b = new Bottle();
		Water w = new Water();
		Milk m = new Milk();
		Juice j = new Juice();
		
		b.store(j);
		
		
		
	}

}
