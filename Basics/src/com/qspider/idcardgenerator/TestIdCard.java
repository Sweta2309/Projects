package com.qspider.idcardgenerator;

public class TestIdCard {
	
	public static void main(String[] args){
		
		IdCard i1 = new IdCard();
		System.out.println(i1);
		System.out.println(i1.name);
		System.out.println(i1.mobileNumber);
		System.out.println(i1.branch);
		i1.name = "Alfa";
		i1.mobileNumber = 988893641l;
		i1.branch = "S_btm";
		System.out.println(i1.name+ " "+ i1.mobileNumber+ " "+ i1.branch);
	}

}
