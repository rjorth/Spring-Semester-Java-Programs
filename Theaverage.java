package DayTwo;

import java.util.Scanner;

public class Theaverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		double first = input.nextDouble();
		System.out.print("Enter a second number ");
		double second = input.nextDouble();
		System.out.print("Enter a thid number ");
		double third = input.nextDouble();
		System.out.println("The average of your numbers is " + (first + second +third)/ 3.0);

	}
	

}
