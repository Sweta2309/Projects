package org.bluestar.acmanufacture;

public class AirConditionor {
	
	Air blow(Water w){
		
		System.out.println("Creating object of Air");
		Air a = new Air();
		System.out.println("throws air out");
		return a;
	}
	
	public static void main(String[] args){
		
		AirConditionor ac = new AirConditionor();
		Water w = new Water();
		Air a = ac.blow(w);
		System.out.println("room get chilled");
	}

	
	
}
