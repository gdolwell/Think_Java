/**
 * select answers to Think Java by Allen Downey Chapter 3.
 *
 * @author gdolwell
 */

import java.util.Scanner;

public class cel_to_far {
	
	public static void main (String args[]) {
		double cel;
		float far;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Celsius= ");
		cel = in.nextDouble();
		far = (float)(cel * 9.0/5.0 + 32.0);
		System.out.printf("%.1f C = %.1f F.\n", cel, far);
	}
}

