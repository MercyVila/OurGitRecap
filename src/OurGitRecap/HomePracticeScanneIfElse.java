package OurGitRecap;

import java.util.Scanner;

public class HomePracticeScanneIfElse {
	public static void main(String[] args) {
		/*
		 * Use Scanner Use AND,OR Operator
		 * 
		 * 1. Ask the user to enter the height in inches. Person should be classified as
		 * one of the following: • short (under 60 inch) • medium (between 60 -72 inch)
		 * • tall (over 72 inch)
		 * 
		 * 2. Write a program that will ask for the day (a number from 1-7). Print
		 * whether it is a weekend or weekday. If any day from 1-5 → output
		 * "It is a weekday" Any day from 6-7 → output "It is a weekend", Any other day
		 * → output "Invalid day"
		 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Plese enter you Height in inches");
		int height = scan.nextInt();
		
		if(height <=60 ) {
			System.out.print("You are a short person");
		}if (height >=60 && height <=72) {
			System.out.print("You are a mediun person");
		}if(height >= 72){
			 System.out.print("You are a Tall person");
            
		}

			System.out.println();
			

}
}
