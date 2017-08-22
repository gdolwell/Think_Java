/**
 *
 *
 */

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int c;
		
		System.out.print("Number = ");
        c = in.nextInt();
        
        System.out.println(factorial(c));
        //for(int i = 0; i < ; i++){
        //    System.out.println(i +"\t" + factorial(i));
        //}
    }
    public static BigInteger factorial(int x){
         BigInteger y = BigInteger.valueOf(1);
        if(x ==0){
            return BigInteger.valueOf(1);
        }
        else if(x<0){
            return BigInteger.valueOf(0);
        }
        else{
            for (int i = 1; i <= x; i ++){
            y = y.multiply(BigInteger.valueOf(i));
            }
        }
        return y;
    }
}