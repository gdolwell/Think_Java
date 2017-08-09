/**
 * Select answers to Think Java by Allen Downey Chapter 6.
 * @author: gdolwell
 * take an int n and add up all odds less than equal to n.
 */

import java.util.Scanner;

public class oddCount {
	
	public static void main (String args[]) {
		int n = 7;
		System.out.printf("%d.\n", oddSum(n));
	} 
	
	public static int oddSum(int n){
		if (n == 1) {
			return 1;
		}
		if (n % 2 == 0){
			return oddSum(n-1);
		}
		int recurse = oddSum(n - 1);
		int result = n + recurse;
		return result;
	}

}
