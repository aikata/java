
// import scanner
import java.util.Scanner;

public class programmingExerciseTwo {
	
	/* Main Application */
	public static void main(String[] args) {
		// open scanner
		Scanner in = new Scanner(System.in);
		// display output for user
		System.out.print("Input an integer: ");
		// capture input as integer
		int digits = in.nextInt();
		// call function to return sum of digits captured
		System.out.println(getSum(digits));
		// close scanner
		in.close();
	}

	/* Function to get sum of digits */
	static int getSum(int digits) {
		// set working variable to 0
		int sum = 0;
		// start while loop break when digits = 0
		while (digits != 0) {
			// set sum variable to remainder of digits divided by 10 to strip first digit
			sum = sum + digits % 10;
			// set digits to next smallest value by factor of 10
			digits = digits / 10;
		}
		// return computed sum of digits after while loop closes
		return sum;
	}
}
