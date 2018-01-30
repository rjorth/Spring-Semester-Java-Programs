package DayTwo;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle as a unitless number ");
		double length = input.nextDouble();
		System.out.print("Enter the width ");
		double width = input.nextDouble();
		System.out.println("The area is " + length * width);

	}

}
