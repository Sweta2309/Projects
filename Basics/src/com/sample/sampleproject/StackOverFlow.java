package com.sample.sampleproject;

public class StackOverFlow {
	
	void show(){
		
		disp();
		System.out.println("show method");
	}
	
	void disp(){
		
		show();
		System.out.println("display method");
		
		
	}
	
	public static void main(String[] args){
		
		StackOverFlow s = new StackOverFlow();
		s.show();
	}

}
