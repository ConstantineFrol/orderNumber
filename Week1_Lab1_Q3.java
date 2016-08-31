package Practicing2ndYear;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 */
public class Week1_Lab1_Q3 {

	public static void main(String[] args) {

		// Scanner named inputData
		Scanner inputData = new Scanner(System.in);

		// Initialize variables
		String userOrderNumber = "";
		char firstChar = 0;
		char lastChar = 0;
		int userOrderNumberLength = 0;
		int count = 0;

		// Ask user to input order number
		System.out.println("please input order number\nThis number is case insensitive,\nmust be 5 - 7 characters long,\nBegin with 'R' or 'r', and end with 'X' or 'x'");

		// Read from keyboard and store in variable userOrderNumber
		userOrderNumber = inputData.nextLine();

		// using while-loop to keep asking input user data until result won't meet conditions 
		while((userOrderNumber.toLowerCase().charAt(0) != 'r') || (userOrderNumber.length() < 5 || userOrderNumber.length() > 7) || (userOrderNumber.toLowerCase().charAt(userOrderNumber.length()-1) != 'x'))
		{
			count++;
			System.out.println("invalid input, Please try again");
			userOrderNumber = inputData.nextLine();
			if(count == 2)
			{
				System.out.println("please input order number\nThis number is case insensitive,\nmust be 5 - 7 characters long,\nBegin with 'R' or 'r', and end with 'X' or 'x'");
			}
		}

		// Display first, last and length of the order number
		firstChar = userOrderNumber.charAt(0);
		lastChar = userOrderNumber.charAt(userOrderNumber.length()-1);
		userOrderNumberLength = userOrderNumber.length();
		System.out.println("The first character is: " + firstChar + "\nThe last character is: " + lastChar + "\nThe Length of the order number is: " + userOrderNumberLength);

		// Close Scanner
		inputData.close();

	}

}
