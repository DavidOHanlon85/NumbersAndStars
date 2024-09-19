/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise05_NumbersAndStars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput;

		userInput = userInput();
		printNumbersAndStars(userInput);

	}

	/**
	 * This method takes an input from the user
	 * 
	 * @return - Returns the integer inputed by the user - Validation check also
	 *         performed as well as try/ catch
	 */
	public static int userInput() {

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		int userInput;

		// Do While Loop

		try {

			do {
				// Prompt
				System.out.println("Give me a number between 5 - 50 (inclusive)");

				userInput = myScan.nextInt();

				myScan.nextLine(); // Clear scanner

				myScan.close(); // Close scanner

			} while (userInput < 5 || userInput > 50);

		} catch (Exception ex) {
			System.out.println("Invalid input - run program again");
			return -1;
		}

		return userInput;

	}

	/**
	 * This method prints a countdown and stars based on the user input
	 * 
	 * @param userInput - Input from user
	 */

	public static void printNumbersAndStars(int userInput) {

		for (int i = userInput; i >= 0; i--) {
			System.out.print(i + "\t");
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
