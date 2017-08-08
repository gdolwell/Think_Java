/**
 * select answers to Think Java by Allen Downey Chapter 5.
 *
 * @author gdolwell
 */

import java.util.Random;
import java.util.Scanner;

public class number_guess {
	public static void main(String[] args) {
		// pick a random number
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int n = random.nextInt(10) + 1;
		int count;
		count = 3;
		guess(n, count);
	}
	
	public static void start(int n, int count){
		if (count != 0){
			guess(n, count);
		} else {
			System.out.printf("You are out of guesses, the number was %d.\n", n);
		}
	}
	
	public static void guess(int n, int count){
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("Please guess a number between 1 and 10: ");
		x = in.nextInt();
		
		if (x > n){
			System.out.println("Too high.");
			count--;
			start(n, count);
		} else if (x < n){
			System.out.println("Too low.");
			count--;
			start(n, count);
		} else if (x == n){
			System.out.println("Correct");
		}
	}
	
}
