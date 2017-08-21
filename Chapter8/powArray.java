/**
 * Select answers to Think Java by Allen Downey Chapter 8.
 * @author: gdolwell
 * 
 */

import java.util.Scanner;

public class powArray {
	
	public static void main (String args[]) {
		double[] arrayed = new double[10];
		for (int i = 0; i <10; i++){
			arrayed[i] = i + 1;
		}
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer to power 1-10: ");
		int n = in.nextInt();
		arrayed = poweredArray(arrayed, n);
		
		for (int i = 0; i < 5; i++){
			System.out.print(arrayed[i] + "\t");
		}
		System.out.println();
		for (int i = 5; i < 10; i++){
			System.out.print(arrayed[i] + "\t");
		}
		System.out.println();
		
	}
	
	public static double[] poweredArray(double[] array, int n){
		for (int i = 0; i < array.length; i++){
			array[i] = Math.pow(array[i], n);
		}
		return array;
	}
}

