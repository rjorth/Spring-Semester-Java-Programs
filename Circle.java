package DayTwo;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		final double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius ");
		
		double radius = input.nextDouble();
		System.out.println("The area of the circle with radius " + radius +
				" is " + PI*radius*radius);
		
		

	}

}
