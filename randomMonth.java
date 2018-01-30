package DayTwo;

import java.util.Random;
public class randomMonth {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(12) + 1;
		switch(n) {
		case 1: System.out.print("Janurary");
		break;
		case 2: System.out.print("February");
		break;
		
		case 3: System.out.print("March"); 
		break;
		case 4: System.out.print("April");
		
		case 5: System.out.print("May");
		break;
		
		case 6: System.out.print("June");
		break;
		
		case 7: System.out.print("July"); break;
		case 8: System.out.print("August"); break;
		case 9: System.out.print("September");break;
		case 10: System.out.print("Octorber"); break;
		case 11: System.out.print("November"); break;
		case 12: System.out.print("December");
		
		
		
		}

	}

}
