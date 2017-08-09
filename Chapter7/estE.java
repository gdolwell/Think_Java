/**
 * Select answers to Think Java by Allen Downey Chapter 7.
 * @author: gdolwell
 * estimates the number e
 */



public class estE {
	
	public static void main (String args[]) {
		System.out.println(estimateE(1, 1000));
	}
	public static double estimateE(int x, int n){
		double y = 1;
		for (int i = 1; i <= n; i++){
			y = y + powered(x, i)/facty(i);
		}
		return y;
	}
	
	
	
	public static double powered(double x, double n){
		double y = 1;
		for( int i =1; i <= n; i++){
			y = y * x;
		}
		return y;
	}
	
	
	public static double facty(double x){
		double y = 1;
		for (int i = 1; i <= x; i++){
			y = y * i;
		}
		return y;
	}
}
