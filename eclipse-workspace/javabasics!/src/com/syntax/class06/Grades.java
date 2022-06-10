package com.syntax.class06;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
System.out.println("enter the score you gte in quiz");
	int quiz= input.nextInt();
	
	System.out.println("enter the score you get in midterm");
	int mid= input.nextInt();
	
	System.out.println("enter the score you get in final");
	int fin= input.nextInt();
	
	int averageS= (quiz + mid + fin)/3;
	
	System.out.println("your average score is" + averageS);
	
	if (averageS >= 90) {
		System.out.println("your grade is A");
	
	}else if (averageS>= 70 &&averageS >=90) {
		System.out.println("your grade is B");
	
	}else if (averageS>= 50 && averageS<70) {
		System.out.println("your grade is c");
	
	}else if  (averageS <50) {
		System.out.println("your grade is F");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
