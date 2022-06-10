package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter two numbers");
		double x = scan.nextInt();
		double y= scan.nextInt();
		double result=0;
		System.out.println("please enter operator");
		char op= scan.next().charAt(0);
		switch (op) {
		case '*':
			result=x*y;
			break;
		case'/':
			result=x/y;
			break;
		case'+':
			result=x+y;
			break;
		case'-':
			result=x-y;
			break;
		default:
			System.out.println("invalid operator");
		}
		
		
		System.out.println(x + "" + op + "" + y +"=" + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
