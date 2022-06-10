package com.syntax.class06;

import java.util.Scanner;

public class hwReview {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter number of years");
		int years =input.nextInt();
		if (years>=5) {
			
			System.out.println("you are eligible for bonus");
			System.out.println("enter annual salary");
			int salary =input.nextInt();
			
			if (salary>50000) {
				System.out.println("you are eligable for 5000");
			}else {
				System.out.println("you are eligable for 3000 for bonus");
			}
			
			
			
		}

		System.out.println("current time");
		int time=input.nextInt();
		
		if(time>=1 && time<=11) {
			System.out.println("morning");
		
		}else if (time>=12 && time<=15) {
			System.out.println("afternoon");
		}else if (time>=16 && time<=20) {
			System.out.println("evening");
		}else if (time>=21 && time<=24) {
			System.out.println("night");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
