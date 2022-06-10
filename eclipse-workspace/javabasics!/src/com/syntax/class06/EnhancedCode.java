package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the score you get in quiz");
		int quiz = input.nextInt();

		System.out.println("enter the score you get in midterm");
		int mid = input.nextInt();

		System.out.println("enter the score you get in final");
		int fin = input.nextInt();

		int averageS = (quiz + mid + fin) / 3;

		System.out.println("your average score is" + averageS);

		if (averageS >= 90) {
			System.out.println("your grade is A");
			char grade;

			if (averageS >= 90) {
				grade = 'A';
			} else if (averageS >= 70 && averageS <= 90) {
				grade = 'B';
			} else if (averageS >= 50 && averageS < 70) {
				grade = 'C';

			} else {
				grade = 'F';
			}

			System.out.println("you are a " + grade + " student");

			if (grade == 'A' || grade == 'B') {
				System.out.println("you are doing great");
			} else {
				System.out.println("please try to study more");
			}

		}
	}

}
