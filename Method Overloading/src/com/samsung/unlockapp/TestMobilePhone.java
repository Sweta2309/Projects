package com.samsung.unlockapp;

public class TestMobilePhone {
	
	
	public static void main(String[] args){
		
		System.out.println("creating object of mobile phone");
		MobilePhone m = new MobilePhone();
		System.out.println("creating object of pattern");
		Pattern p = new Pattern();
		System.out.println("unlock the mobile phone after receiving pattern");
		m.unlock(p);
		System.out.println("mobile phone is unlock");
		m.unlock(1234);
		System.out.println("mobile is unlock");
	
	}

}
