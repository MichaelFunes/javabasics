package com.syntaxclass02;

public class NonPrimitives {

	public static void main(String[] args) {
		// 
		String name="Mike";
		
		String lastName="Funes";
		
		long phone=12334567890l;
		
		// xxx-xxx-xxxx
		
		String phoneNumbers="123-456-7890";
		
		String address="123 washington str";
		
		String age="30";
		String city="Virginia";
	
		//shortcut for printing
		//syso +ctrl +space hit enter
		
		/*
		 * we can use +
		 *               to attach String to String
		 */
		System.out.println(name+" "+lastName);//Mike Funes
           //Mike lives in Virginia 
		System.out.println(name+" lives in "+city);
		//Mike is 30 years old 
		System.out.println(name+" is "+age+" years old");
		
	}

}
