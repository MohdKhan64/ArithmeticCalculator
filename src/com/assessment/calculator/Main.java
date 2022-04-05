package com.assessment.calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = 0; 
		float a = 0, b = 0;
		do {
			System.out.println("Enter 0. Exit");
			System.out.println("Enter 1. Addition");
			System.out.println("Enter 2. Subtraction");
			System.out.println("Enter 3. Multiplication");
			System.out.println("Enter 4. Division");
			n = sc.nextInt();
			if (n == 0)
				return;
			System.out.println("Enter two values : ");
			a = sc.nextFloat();
			b = sc.nextFloat();
			switch(n) {
			case 1 : Addition add = new Addition();
			         add.calculate(a, b);
			         break;
			case 2 : Subtraction sub = new Subtraction();
			         sub.calculate(a, b);
			         break;
			case 3 : Multiplication mult = new Multiplication();
	                 mult.calculate(a, b);
	                 break;
	        case 4 : Division div = new Division();
	                 div.calculate(a, b);
	                 break;         
			default : System.out.println("wrong Input!!!!");
			          break; 
			}
		}while(n > 0);

	}

}
