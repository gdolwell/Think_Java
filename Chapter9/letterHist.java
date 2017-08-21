/**
 * Select answers to Think Java by Allen Downey Chapter 9.
 * @author: gdolwell
 * 
 */

import java.util.Arrays;

public class letterHist{
    public static void main(String[] args){
        String input = "";
        int[] letterCount = new int[26];
		for (String arg : args){
			input = input +  arg;
        }
        input = input.toLowerCase();
        
        for(char letter : input.toCharArray()){
            letterCount[((int)letter - 97)]++;
            //System.out.println(letter + "\t" + ((int)letter - 97));
        }
        for(int i = 0; i < 26; i++){
            System.out.println((char)(i+65) + "\t" + letterCount[i]);
        }
    }
}

