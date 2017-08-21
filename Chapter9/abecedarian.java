/**
 * Select answers to Think Java by Allen Downey Chapter 9.
 * @author: gdolwell
 * 
 */
import java.util.Arrays;

public class abecedarian{
    public static void main(String[] args){
        String input = "";
        for(String arg : args){
            input += arg;
        }
        System.out.println(isAbecedarian(input));
    }
    public static boolean isAbecedarian(String input){
        boolean tf = true;
        for( int i = 0; i < input.length() - 1; i++){
            if (((int)input.toCharArray()[i]) > ((int)input.toCharArray()[i+1])){
                tf = false;
            }
        }
        return tf;
    }    
}