package com.paytm.loginapp;

public class TestPaytm {

	public static void main(String[] args){
		
		System.out.println("open the paytm website");
		Paytm p = new  Paytm();
		System.out.println("trying to login");
		p.login(9473593079L , "sweta@123");
		p.login("sweta.jain@gmail.com" , "sweta@123");
		
	}

}
