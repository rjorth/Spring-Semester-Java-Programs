package DayTwo;
import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a line, then hit return.\n>>>");
		String line = input.nextLine();
		System.out.println("Your intput was " + line);

	}

}
