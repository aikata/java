
// import scanner
import java.util.Scanner;

public class programmingExerciseTwoCF {
	
	/* Main Application */
	public static void main(String[] args) {
		// open scanner
		Scanner in = new Scanner(System.in);
		// display output for user for fahrenheit
		System.out.print("Enter a Fahrenheit temperature: ");
		// capture input as integer variable inputFahrenheit
		int inputFahrenheit = in.nextInt();
		// call getCelsiusFromFahrenheit method with inputFahrenheit variable and
		// display return value
		System.out.println(inputFahrenheit + "F is equivalent to " + getCelsiusFromFahrenheit(inputFahrenheit) + "C");
		// display output for user for celsius
		System.out.print("Enter a Celsius temperature: ");
		// capture input as integer variable inputCelsius
		int inputCelsius = in.nextInt();
		// call getFahrenheitFromCelsius method with inputCelsius variable and display
		// return value
		System.out.println(inputCelsius + "C is equivalent to " + getFahrenheitFromCelsius(inputCelsius) + "F");
		// close scanner
		in.close();
	}

	/* Fahrenheit to Celsius method */
	static double getCelsiusFromFahrenheit(int inputFahrenheit) {
		// compute Celsius
		return ((inputFahrenheit - 32) * 5.0 / 9.0);
	}

	/* Celsius to Fahrenheit method */
	static double getFahrenheitFromCelsius(int inputCelsius) {
		// compute Fahrenheit
		return (9.0 / 5.0 * inputCelsius + 32);
	}
}
