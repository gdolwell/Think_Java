/**
 * Select answers to Think Java by Allen Downey Chapter 7.
 * @author: gdolwell
 * estimates the square root of a number.
 */


public class squareRoot {
	
	public static void main (String args[]) {
		get_squareRoot(9, 9/2);
	}
	public static float get_squareRoot(float y, float x0){
		float x1;
		x1 = ((x0 + (y/x0)) / 2);
		//System.out.printf("%f    %f    %f\n", y, x0, x1);
		if ((x0 - x1 < .00001)){
			System.out.println("The approximate square root of " +
				y + " is " + x1 + ".");
				return 0;
		} else {
			System.out.printf("%f    %f    %f\n", y, x0, x1);
			return get_squareRoot(y, x1);
		}
	}
}

