package DayTwo;
import java.util.Scanner; 

public class Doubling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double num = in.nextDouble(); 
		int count = 0; 
		for (; count < 100 && num <= 1000000; ++count) {
			num *= 2;
			System.out.println("After all that, my number is " + num); 
			in.close(); 
		}
	}
}
			
	

	
