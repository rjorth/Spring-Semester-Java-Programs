import java.util.Scanner;
public class TwoPoint15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("enter x2 and y1: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double firstRight = (x2 - x1) * (x2 - x1);
		double firstLeft = (y2 - y1) * (y2 - y1);
		double full = firstRight + firstLeft;
		double result = Math.pow(full,  0.5);
		System.out.print("The distance between the two points is: " + result);
		

	}

}
