/**
 * Select answers to Think Java by Allen Downey Chapter 5
 * @author: gdolwell
 */

import java.util.Scanner;

public class fermat {
	
	public static void main (String args[]) {
		int a, b, c, n;
		double an, bn, cn;
		Scanner in = new Scanner(System.in);
		
		System.out.print("a = ");
		a = in.nextInt();
		System.out.print("b = ");
		b = in.nextInt();
		System.out.print("c = ");
		c = in.nextInt();
		System.out.print("n = ");
		n = in.nextInt();
		
		an = Math.pow(a, n);
		bn = Math.pow(b, n);
		cn = Math.pow(c, n);
		
		if (an + -bn == cn){
		    System.out.printf("%.0f + %.0f = %.0f and Fermat was wrong.\n", an, bn, cn);
		} else {
			System.out.printf("%.0f + %.0f != %.0f and Fermat is still right.\n", an, bn, cn);
		}
	} 
}


