/**
 * select Answer to Think Java by Allen Downey Chapter 3
 * author: gdolwell
 */

import java.util.Scanner;

public class seconds_to {
	
	public static void main (String args[]) {
		int input, seconds, minutes, hours;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of seconds: ");
		input = in.nextInt();
		hours = (input / 3600);
		minutes = (input % 3600) / 60;
		seconds = (input % 60);
		input = (input);
		System.out.printf("There are %d hours, %d minutes and %d seconds in %d seconds. \n", hours, minutes, seconds, input);
		
	}
}

