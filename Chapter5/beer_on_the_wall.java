/**
 * select answers to Think Java by Allen Downey Chapter 5.
 *
 * @author gdolwell
 */




public class beer_on_the_wall {
	
	public static void main (String args[]) {
		int n;
		n = 0;
		take_one_down(n);
		System.out.println();
	}

	public static void take_one_down(int n) {
		if (n != 3){
			System.out.printf("\n%d bottles of beer on the wall,\n", (99 - n));
			System.out.printf("%d bottles of beer,\n", (99 - n));
			System.out.println("ya’ take one down, ya’ pass it around,");
			n++;
			System.out.printf("%d bottles of beer on the wall.\n", (99 - n));
			take_one_down(n);
		}
	}
}
