import java.util.Scanner; 

public class TwoPoint21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investment = input.nextDouble(); 
		System.out.print("Enter interest rate as percantage: ");
		double percentage = input.nextDouble(); 
		double percentMonths = percentage/12;
		double interest = percentMonths/100;
		double inPar = (1 + interest);
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		double yearsByMonths = years*12;
		double increaseBy = Math.pow(inPar, yearsByMonths); 
		double fullValue = investment * increaseBy;
		
		
		System.out.print("Accumulated value is: " + fullValue);
		
		
		

	}

}
