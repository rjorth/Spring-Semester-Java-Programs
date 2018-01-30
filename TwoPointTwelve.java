import java.util.Scanner;

public class TwoPointTwelve {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		double first = input.nextDouble(); 
		double second = input.nextDouble();
		double a = second * 2;
		double v = first * first;
		double length = v/a;
		System.out.print("The length should be: " + length);
		
		
		

	}

}
