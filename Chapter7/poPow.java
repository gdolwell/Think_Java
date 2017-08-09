/**
 * Select answers to Think Java by Allen Downey Chapter 7.
 * @author: gdolwell
 * raises x to the n.
 */



public class poPow {
	
	public static void main (String args[]) {
		System.out.println(powered(2, 4));
	}
	public static double powered(double x, double n){
		double y = 1;
		for( int i =1; i <= n; i++){
			y = y * x;
		}
		return y;
	}
}

