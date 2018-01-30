import java.util.Scanner; 

public class TwoPointSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a number between 0 and 1000: ");
		int my_number = input.nextInt();
		int first = my_number % 10;
		int justTwo = my_number / 10;
		int second = justTwo % 10;
		int third = justTwo / 10;
		int sum = third + second + first;
		System.out.print("The sum of the digits is " + sum);
		
				

	}

}
