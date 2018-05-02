package com.amazon.paymentapp;

public class TestAmazon {
	
	public static void main(String[] args){
		
		System.out.println("Opening the amazon website");
		Amazon a = new Amazon();
		System.out.println("we have debit card");
		DebitCard d = new DebitCard();
		System.out.println("making the payment using debit card");
		Product product = a.pay(d);
		System.out.println(product);
		System.out.println("received the product");
	}

}
