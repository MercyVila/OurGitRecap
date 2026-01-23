package OurGitRecap;


import java.util.Scanner;

public class HomePraticeAndorOperator {

	public static void main(String[] args) {
		/* 2. Write a program that will ask for the day (a number from 1-7). Print
		 * whether it is a weekend or weekday. If any day from 1-5 → output
		 * "It is a weekday" Any day from 6-7 → output "It is a weekend", Any other day
		 * → output "Invalid day"
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int days = scan.nextInt();
		
		if(days >=1 && days <=5 ) {
			System.out.println("It's a Weekday");
			
		}else if(days ==6 ||days ==7 ) {
			System.out.println("It's the Weekend");
			
		}else {
			System.out.print("Invalid day");
		}
	}

}
